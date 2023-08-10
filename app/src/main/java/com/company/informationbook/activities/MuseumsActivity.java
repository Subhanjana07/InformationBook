package com.company.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewpagerAdapterMuseums;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MuseumsActivity extends AppCompatActivity {

    private TabLayout tabLayoutMuseums;
    private ViewPager2 viewPagerMuseums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musuems);

        Toolbar toolbar = findViewById(R.id.toolbarWonders);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Museums");

        tabLayoutMuseums = findViewById(R.id.tabLayoutWonders);
        viewPagerMuseums = findViewById(R.id.viewpagerWonders);

        ViewpagerAdapterMuseums adapterMuseums = new ViewpagerAdapterMuseums(getSupportFragmentManager(),getLifecycle());
        viewPagerMuseums.setAdapter(adapterMuseums);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutMuseums, viewPagerMuseums, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("THE BRITISH MUSUEM");
                        break;
                    case 1:
                        tab.setText("VATICAN MUSEUM");
                        break;
                    case 2:
                        tab.setText("STATE HERMITAGE MUSEUM");
                        break;
                    case 3:
                        tab.setText("LOUVRE MUSEUM");
                        break;
                    case  4:
                        tab.setText("INDIAN MUSEUM");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

    }
}