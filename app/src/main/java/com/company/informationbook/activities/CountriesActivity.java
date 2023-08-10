package com.company.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewpagerAdapterCountries;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2uk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        Toolbar toolbar = findViewById(R.id.toolbarWonders);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Countries");

        tabLayout = findViewById(R.id.tabLayoutWonders);
        viewPager2uk = findViewById(R.id.viewpagerWonders);

        ViewpagerAdapterCountries adapterCountries = new ViewpagerAdapterCountries(getSupportFragmentManager(),getLifecycle());
        viewPager2uk.setAdapter(adapterCountries);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2uk, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("UNITED KINGDOM");
                        break;
                    case 1:
                        tab.setText("FRANCE");
                        break;
                    case 2:
                        tab.setText("INDIA");
                        break;
                    case 3:
                        tab.setText("SWITZERLAND");
                        break;
                    case  4:
                        tab.setText("ITALY");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

    }
}