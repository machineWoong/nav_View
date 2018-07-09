package com.example.jeon.nav_view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class manu4 extends Fragment {
    private static final String ARG_COLUMN_COUNT = "column-count";

    public manu4() {
        // Required empty public constructor
    }

    // 프레그먼트 설정.
    public static manu4 newInstance(int columnCount) {

        manu4 fragment = new manu4();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manu4, container, false);
    }

}
