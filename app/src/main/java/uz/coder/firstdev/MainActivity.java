package uz.coder.firstdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import uz.coder.firstdev.controller.PagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.viewPager);
        tabs = findViewById(R.id.tabLayout);
        pager.setAdapter(new PagerAdapter(getSupportFragmentManager(),getApplicationContext()));
        tabs.setupWithViewPager(pager);
    }
}
