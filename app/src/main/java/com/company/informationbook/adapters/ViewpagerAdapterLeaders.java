package com.company.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.FragmentAbrahim;
import com.company.informationbook.fragments.FragmentFrance;
import com.company.informationbook.fragments.FragmentIndia;
import com.company.informationbook.fragments.FragmentItaly;
import com.company.informationbook.fragments.FragmentNelson;
import com.company.informationbook.fragments.FragmentSubhas;
import com.company.informationbook.fragments.FragmentSwiss;
import com.company.informationbook.fragments.FragmentTeresa;
import com.company.informationbook.fragments.FragmentWinston;
import com.company.informationbook.fragments.Fragmentuk;

public class ViewpagerAdapterLeaders extends FragmentStateAdapter {
    public ViewpagerAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position){
            case  0:
                fragment = FragmentSubhas.newInstance();
                break;
            case 1:
                fragment = FragmentNelson.newInstance();
                break;
            case 2:
                fragment = FragmentWinston.newInstance();
                break;
            case 3:
                fragment = FragmentAbrahim.newInstance();
                break;
            case 4:
                fragment = FragmentTeresa.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
