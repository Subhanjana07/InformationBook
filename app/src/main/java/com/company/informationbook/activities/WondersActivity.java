package com.company.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewpagerAdapterMuseums;
import com.company.informationbook.adapters.ViewpagerAdapterWonders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WondersActivity extends AppCompatActivity {

    private TabLayout tabLayoutWonders;
    private ViewPager2 viewPagerWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        Toolbar toolbar = findViewById(R.id.toolbarWonders);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Wonders");

        tabLayoutWonders = findViewById(R.id.tabLayoutWonders);
        viewPagerWonders = findViewById(R.id.viewpagerWonders);

        ViewpagerAdapterWonders adapterWonders = new ViewpagerAdapterWonders(getSupportFragmentManager(),getLifecycle());
        viewPagerWonders.setAdapter(adapterWonders);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutWonders, viewPagerWonders, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("TAJ MAHAL");
                        break;
                    case 1:
                        tab.setText("COLOSSEUM");
                        break;
                    case 2:
                        tab.setText("GREAT WALLS OF CHINA");
                        break;
                    case 3:
                        tab.setText("MACHU PICHU");
                        break;
                    case  4:
                        tab.setText("THE GREAT PYRAMID OF GIZA");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

    }
}