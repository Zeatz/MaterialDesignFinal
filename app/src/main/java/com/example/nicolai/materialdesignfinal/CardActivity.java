package com.example.nicolai.materialdesignfinal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CardActivity extends AppCompatActivity {
    public ImageView picture;
    public TextView name;
    public TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        picture = (ImageView) findViewById(R.id.card_image);
        name = (TextView) findViewById(R.id.card_title);
        description = (TextView) findViewById(R.id.card_text);
    }

    public void OnClickCardButton(View view){
        Button button = (Button)findViewById(R.id.action_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {Snackbar.make(v, "Action is pressed", Snackbar.LENGTH_LONG).show();
            }
        });
    }
    public void OnClickShare(View view){
        ImageButton button = (ImageButton)findViewById(R.id.share_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {Snackbar.make(v, "Share is pressed", Snackbar.LENGTH_LONG).show();
            }
        });
    }
    public void OnClickLike(View view){
        ImageButton button = (ImageButton)findViewById(R.id.favorite_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {Snackbar.make(v, "Favorite is pressed", Snackbar.LENGTH_LONG).show();
            }
        });
    }




}