package com.company.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.FragmentAbrahim;
import com.company.informationbook.fragments.FragmentBritishMuseums;
import com.company.informationbook.fragments.FragmentHermitage;
import com.company.informationbook.fragments.FragmentIndian;
import com.company.informationbook.fragments.FragmentLouvre;
import com.company.informationbook.fragments.FragmentNelson;
import com.company.informationbook.fragments.FragmentSubhas;
import com.company.informationbook.fragments.FragmentTeresa;
import com.company.informationbook.fragments.FragmentVatican;
import com.company.informationbook.fragments.FragmentWinston;

public class ViewpagerAdapterMuseums extends FragmentStateAdapter {
    public ViewpagerAdapterMuseums(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position){
            case  0:
                fragment = FragmentBritishMuseums.newInstance();
                break;
            case 1:
                fragment = FragmentVatican.newInstance();
                break;
            case 2:
                fragment = FragmentHermitage.newInstance();
                break;
            case 3:
                fragment = FragmentLouvre.newInstance();
                break;
            case 4:
                fragment = FragmentIndian.newInstance();
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
