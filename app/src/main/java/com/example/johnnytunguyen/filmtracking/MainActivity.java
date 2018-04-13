package com.example.johnnytunguyen.filmtracking;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.johnnytunguyen.filmtracking.Database.DBManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvFilm;
    ArrayList<MovieInfo> arrMovie;
    FilmAdapter adapter;

    DBManager dbManager ;


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
        //databaseReadRoutine();


        //tao anhXa
        adapter = new FilmAdapter(this,arrMovie);
        lvFilm.setAdapter(adapter);
        lvFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), String.format("This is item :%s", arrMovie.get(position).getTitle()),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(),Film_Container.class);
                startActivity(intent);

            }
        });


    }



    //Reading Record
    private void databaseReadRoutine(){

        String selectQuery = "SELECT  * FROM " +  DBManager.TABLE_NAME;
        Cursor cursor = dbManager.getData(selectQuery);

        while(cursor.moveToNext())

        {
            //need to working on Image
            String title = cursor.getString(cursor.getColumnIndex(DBManager.TITLE));
            String actor = cursor.getString(cursor.getColumnIndex(DBManager.ACTORS));
            int rateTing = cursor.getInt(cursor.getColumnIndex(DBManager.RATING));
            String descrp = cursor.getString(cursor.getColumnIndex(DBManager.DESCRIPTION));
            String  genre = cursor.getString(cursor.getColumnIndex(DBManager.GENER));
             arrMovie.add(new MovieInfo(0,title,actor,descrp,rateTing,genre));

        }

    }//end read  database




    private void databaseWriteRoutine() {


    }


    // tao onclick on List view


    private void Anhxa(){

        lvFilm = findViewById(R.id.main_listview);
        arrMovie = new ArrayList<>();
        arrMovie.add(new MovieInfo(R.drawable.movie_icon,"LAZY IT","Tu Nguyen","Non",3,"funny"));
        dbManager = new DBManager(this);

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
//                Intent intent = new Intent(this,Film_details_Fragment.class);
//                st
//

                break;
            case R.id.action_two:
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_three:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_four:
                Toast.makeText(this, "Developed by Name, version 1.0 ", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
