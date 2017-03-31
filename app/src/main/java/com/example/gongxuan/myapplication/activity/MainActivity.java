package com.example.gongxuan.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.gongxuan.myapplication.R;
import com.example.gongxuan.myapplication.fragment.ItemFragment;
import com.example.gongxuan.myapplication.fragment.dummy.DummyContent;

import java.util.ArrayList;

import static android.R.attr.fragment;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {
private ArrayList<Fragment> fragments;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    changeFragment(0);
                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_notifications:

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fragments = initFragments();
        changeFragment(0);

    }

    //初始化fragment
    private ArrayList<Fragment> initFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(0, ItemFragment.newInstance(3));
        return fragments;
    }

    //切换fragment
    private void changeFragment(int position) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragments.get(0);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, fragment);
        transaction.commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
