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

public class ThirdFragment extends Fragment {

    ////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public ThirdFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        //////Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.soup1,"Tomato cream soup","10% all month","4.7"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fries5,"Pan Fried Potatoes","8% all month","4.6"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.salad5,"Bigfresh Salad with Tuna","14% all month","4.4"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.soup4,"Lentil cream soup","19% all month","4.9"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fries6,"Freshly fried potatoes","20% all month","4.4"));
        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return view;
    }
}