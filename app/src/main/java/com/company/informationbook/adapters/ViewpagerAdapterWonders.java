package com.company.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.FragmentBritishMuseums;
import com.company.informationbook.fragments.FragmentColosseum;
import com.company.informationbook.fragments.FragmentGreatWall;
import com.company.informationbook.fragments.FragmentHermitage;
import com.company.informationbook.fragments.FragmentIndian;
import com.company.informationbook.fragments.FragmentLouvre;
import com.company.informationbook.fragments.FragmentMachu;
import com.company.informationbook.fragments.FragmentPyramid;
import com.company.informationbook.fragments.FragmentTajMahal;
import com.company.informationbook.fragments.FragmentVatican;

public class ViewpagerAdapterWonders extends FragmentStateAdapter {
    public ViewpagerAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position){
            case  0:
                fragment = FragmentTajMahal.newInstance();
                break;
            case 1:
                fragment = FragmentColosseum.newInstance();
                break;
            case 2:
                fragment = FragmentGreatWall.newInstance();
                break;
            case 3:
                fragment = FragmentMachu.newInstance();
                break;
            case 4:
                fragment = FragmentPyramid.newInstance();
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
