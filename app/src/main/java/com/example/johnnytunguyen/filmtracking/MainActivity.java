package com.example.johnnytunguyen.filmtracking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvFilm;
    ArrayList<MovieInfo> arrMovie;
    FilmAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Khởi tạo toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Không hiện tiêu đề
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //Hiện nút back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Anhxa();
        //tao anhXa
        adapter = new FilmAdapter(this,arrMovie);
        lvFilm.setAdapter(adapter);

    }


    private void Anhxa(){

        lvFilm = findViewById(R.id.main_listview);
        arrMovie = new ArrayList<>();
        arrMovie.add(new MovieInfo(R.drawable.movie_icon,"LAZY IT","Tu Nguyen","Non",3,"funny"));

    }


    //inflate menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Bắt sự kiện cho các item Menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_one:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_two:
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_three:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_four:
                Toast.makeText(this, "In developing ", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
