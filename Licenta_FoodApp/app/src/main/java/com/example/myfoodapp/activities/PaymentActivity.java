package com.example.myfoodapp.activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.braintreepayments.cardform.view.CardForm;
import com.example.myfoodapp.R;

public class PaymentActivity extends AppCompatActivity {

    CardForm cardForm;
    Button buy;
    AlertDialog.Builder alertBuider;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cardForm = findViewById(R.id.card_form);
        buy = findViewById(R.id.btnBuy);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        cardForm.cardRequired(true)
                .expirationRequired(true)
                .cvvRequired(true)
                .setup(PaymentActivity.this);
        cardForm.getCvvEditText().setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cardForm.isValid()){
                alertBuider = new AlertDialog.Builder(PaymentActivity.this);
                alertBuider.setTitle("Confirm before purchase");
                alertBuider.setMessage("Card number:"+ cardForm.getCardNumber()+"\n"+
                        "Card expiry date:" + cardForm.getExpirationDateEditText().getText().toString()+ "\n" +
                        "Card CVV:" + cardForm.getCvv());
                alertBuider.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                          dialogInterface.dismiss();
                        Toast.makeText(PaymentActivity.this, "Thank you for purchase", Toast.LENGTH_SHORT).show();
                    }
                });
                alertBuider.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog = alertBuider.create();
                alertDialog.show();
            } else {
                    Toast.makeText(PaymentActivity.this, "Please complete the form", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}