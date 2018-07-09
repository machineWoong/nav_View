package com.example.jeon.nav_view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class main_view_pager_Adapter  extends FragmentPagerAdapter {


    // 이 어댑터는 프래그먼트들을 가지고 있다.
    public ArrayList<Fragment> mData;

    public main_view_pager_Adapter(FragmentManager fm) {
        super(fm);

        mData = new ArrayList<>();
        mData.add(new manu1());
        mData.add(new manu2());
        mData.add(new manu3());
        mData.add(new manu4());

    }

    @Override
    public Fragment getItem(int position) {

        // 포지션에 맞는 프레그먼트 리턴

        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }



    @Override
    public CharSequence getPageTitle(int position) {

        String name="";
        if(position == 0 ){
            name= "메뉴1";
        }else if ( position == 1){
            name = "메뉴2";
        }else if ( position == 2){
            name = "메뉴3";
        }else if ( position == 3){
            name = "메뉴4";
        }
        return name;
    }
}
