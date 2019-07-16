package com.example.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    Button btnColor;
    LinearLayout linear2;

    Integer i = 0;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag2, container,false);

        btnColor = view.findViewById(R.id.btnColour2);
        linear2 = view.findViewById(R.id.linear2);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    linear2.setBackgroundColor(Color.YELLOW);
                    i = 1;
                } else {
                    linear2.setBackgroundColor(Color.LTGRAY);
                    i = 0;
                }
            }
        });

        return view;
    }

}
