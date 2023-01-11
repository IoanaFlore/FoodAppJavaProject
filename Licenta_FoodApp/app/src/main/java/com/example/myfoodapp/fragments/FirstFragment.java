package com.example.myfoodapp.fragments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.FeaturedVerAdapter;
import com.example.myfoodapp.models.FeaturedVerModel;
import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    ////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first2, container, false);
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.burger1,"Classic Burger ","20% off today ","4.7"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.dinner1,"Caesar salad","10% off today","4.8"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.pasta3,"Pasta primavera","15% off today","4.6"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.salad1,"Bigfresh Salad","13% off today","4.6"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.s2,"Vegetal Sandwich","18% off today","4.6"));
        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return  view;
    }
}