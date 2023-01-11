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

public class SecondFragment extends Fragment {
    ////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);
        //////Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec_sec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.sw3,"Apple tart","15% all week","5.0"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.mint_ice,"Mint Ice Cream","20% all week","5.0"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.lemonade_lemon,"Lemon Lemonade","22% all week","4.9"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ice3,"Vanilla Ice Cream","25% all week","4.7"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.sw1,"Cheese tart","18% all week","4.8"));
        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return  view;
    }
}