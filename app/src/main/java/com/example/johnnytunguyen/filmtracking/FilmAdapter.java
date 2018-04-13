package com.example.johnnytunguyen.filmtracking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JohnnyTuNguyen on 2018-04-12.
 */

public class FilmAdapter extends BaseAdapter {

    private Context context;
    private List<MovieInfo> movie;


    public FilmAdapter(Context context,  List<MovieInfo> movie) {
        this.context = context;
        this.movie = movie;

    }

    @Override
    public int getCount() {
      return  movie.size();
    }

    @Override
    public Object getItem(int position) {
       return movie.get(position);

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         view = layoutInflater.inflate(R.layout.row_film,null);

         //annhXa
        ImageView poster = view.findViewById(R.id.PosterFragemnet);
        TextView title = view.findViewById(R.id.Movie_title);
        TextView actor = view.findViewById(R.id.Movie_Actor);
        TextView genres = view.findViewById(R.id.Movie_Gen);
        TextView rating = view.findViewById(R.id.Movie_rate);

        //gan gia tri
        MovieInfo movieInfo= movie.get(position);
        poster.setImageResource(movieInfo.getPoster());
        title.setText("Title:"+movieInfo.getTitle());
        actor.setText("Actors:"+movieInfo.getActors());
        genres.setText("Genre: "+movieInfo.getGenre());
        rating.setText("Rating: "+String.valueOf(movieInfo.getRating()));

        return view;
    }
}
