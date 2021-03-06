package com.example.max.popularmovies.utilities;

import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.URL;

/**
 * Created by Max on 8/24/17.
 */

public class PicassoCreator {
    Picasso poster;
    String urlAsString;
    Context contextIn;
    DisplayMetrics displayMetrics;

    public PicassoCreator(Context context, String posterKey, ImageView target){
        URL url = NetworkUtils.buildPosterUrl(posterKey);
        contextIn = context;
        try {
            urlAsString = NetworkUtils.getResponseFromHttpURL(url);
            Picasso.with(context).load(urlAsString).into(target);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
