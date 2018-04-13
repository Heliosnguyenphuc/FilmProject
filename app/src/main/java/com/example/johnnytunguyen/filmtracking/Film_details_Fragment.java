package com.example.johnnytunguyen.filmtracking;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;

public class Film_details_Fragment extends android.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_film_details,null);

        ImageView Poster =  view.findViewById(R.id.PosterFragemnet);
        EditText title = view .findViewById(R.id.Movie_title_Fragment);
        EditText actors = view .findViewById(R.id.Movie_Actor_Fragment);
        EditText entry = view.findViewById(R.id.entries);
        EditText genre = view.findViewById(R.id.Movie_Gen_Fragemnet);
        RatingBar rating = view.findViewById(R.id.ratingBar);
        Button submit = view .findViewById(R.id.addEntry);

        return view ;
    }
}
