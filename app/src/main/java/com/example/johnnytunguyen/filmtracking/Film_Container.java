package com.example.johnnytunguyen.filmtracking;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Film_Container extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film__container);


        FragmentManager manager = getFragmentManager();
        Film_details_Fragment dt = new Film_details_Fragment();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.add(R.id.container,dt);
        fragmentTransaction.commit();

    }
}
