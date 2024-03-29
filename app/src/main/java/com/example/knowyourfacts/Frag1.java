package com.example.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    Button btnColor;
    LinearLayout linear1;

    ImageView iv;
    Integer i = 0;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag1, container,false);

        btnColor = view.findViewById(R.id.btnColour1);
        linear1 = view.findViewById(R.id.linear1);

        iv = view.findViewById(R.id.iv);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    linear1.setBackgroundColor(Color.parseColor("#B2DFDB"));
                    i = 1;
                } else {
                    linear1.setBackgroundColor(Color.parseColor("#FFCCBC"));
                    i = 0;
                }
            }
        });


        String imageUrl = "https://wtffunfact.com/wp-content/uploads/2019/06/fun-fact-holographic-circus.png";
        Picasso.with(getActivity()).load(imageUrl).into(iv);

        return view;
    }

}
