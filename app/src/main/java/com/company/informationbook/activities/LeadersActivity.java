package com.company.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewpagerAdapterLeaders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LeadersActivity extends AppCompatActivity {

    private TabLayout tabLayoutLeaders;
    private ViewPager2 viewPagerLeaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        Toolbar toolbar = findViewById(R.id.toolbarWonders);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Leaders");

        tabLayoutLeaders = findViewById(R.id.tabLayoutWonders);
        viewPagerLeaders = findViewById(R.id.viewpagerWonders);

        ViewpagerAdapterLeaders adapterLeaders = new ViewpagerAdapterLeaders(getSupportFragmentManager(),getLifecycle());
        viewPagerLeaders.setAdapter(adapterLeaders);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutLeaders, viewPagerLeaders, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("NETAJI SUBHAS CHANDRA BOSE");
                        break;
                    case 1:
                        tab.setText("NELSON MANDELA");
                        break;
                    case 2:
                        tab.setText("WINSTON CHURCHILL");
                        break;
                    case 3:
                        tab.setText("ABRAHIM LINCOLN");
                        break;
                    case  4:
                        tab.setText("MOTHER TERESA");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

    }
}