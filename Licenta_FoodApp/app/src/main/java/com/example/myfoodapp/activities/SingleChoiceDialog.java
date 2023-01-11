package com.example.myfoodapp.activities;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class SingleChoiceDialog extends DialogFragment {

    private AlertDialog.Builder builder;
    private Dialog dialog;
    private Context context;
    private String[] data;

    public SingleChoiceDialog(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        builder = new AlertDialog.Builder(context);
        builder.setTitle("Payment method");
        builder.setSingleChoiceItems(data, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "Selected:" + data[i], Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Toast.makeText(context, "The order has been placed", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Toast.makeText(context, "The order wasn't placed", Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
}
