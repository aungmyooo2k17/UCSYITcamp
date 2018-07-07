package org.itcamp.ucsy.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import org.itcamp.ucsy.R;
import org.itcamp.ucsy.fragment.PdfFragment;
import org.itcamp.ucsy.fragment.ScheduleFragment;
import org.itcamp.ucsy.fragment.SpeakerFragment;
import org.itcamp.ucsy.fragment.VideoFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @BindView(R.id.bottom_navigation)
    BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ScheduleFragment()).commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;
        switch (item.getItemId()){
            case R.id.navigation_home:
                selectedFragment = new ScheduleFragment();break;

            case R.id.navigation_location:
                selectedFragment = new VideoFragment();break;

            case R.id.navigation_favorite:
                selectedFragment = new PdfFragment();break;

            case R.id.navigation_setting:
                selectedFragment = new SpeakerFragment();break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
        return true;
    }
}
