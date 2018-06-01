package com.curso.gasnroad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;


import com.squareup.picasso.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Picasso.get().load(R.mipmap.img1).transform(new CircleTransform()).into((ImageView) findViewById(R.id.first));
        Picasso.get().load(R.mipmap.img2).transform(new CircleTransform()).into((ImageView) findViewById(R.id.second));
        Picasso.get().load(R.mipmap.img1).transform(new CircleTransform()).into((ImageView) findViewById(R.id.third));
        Picasso.get().load(R.mipmap.img4).transform(new CircleTransform()).into((ImageView) findViewById(R.id.four));
        Picasso.get().load(R.mipmap.img2).transform(new CircleTransform()).into((ImageView) findViewById(R.id.five));
        Picasso.get().load(R.mipmap.img4).transform(new CircleTransform()).into((ImageView) findViewById(R.id.six));
        Picasso.get().load(R.mipmap.img3).transform(new CircleTransform()).into((ImageView) findViewById(R.id.premium));

    }

}
