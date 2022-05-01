package com.example.fa18_bcs_107madassignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private com.example.bse5a_lab_fragsimple.LeftFragment leftFragment;
    private com.example.bse5a_lab_fragsimple.RightFragment rightFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orinetation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            FragmentManager fragmentManager = getSupportFragmentManager();
            leftFragment = fragmentManager. findFragmentById(R.id.fragmentContainerViewLeft)
            rightFragment = (com.example.bse5a_lab_fragsimple.RightFragment) fragmentManager. findFragmentById(R.id.fragmentContainerViewright)
        }
        @Override
        public void sendMessage(String message){
            rightFragment.getMessage();
        }
    }