package com.example.jeon.nav_view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class manu2 extends Fragment {

    private static final String ARG_COLUMN_COUNT = "column-count";

    public manu2() {
        // Required empty public constructor
    }


    // 프레그먼트 설정.
    public static manu2 newInstance(int columnCount) {

        manu2 fragment = new manu2();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manu2, container, false);
    }

}
