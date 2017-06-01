package com.example.nicolai.materialdesignfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FrontScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_screen);
    }

    public void OnClickFloating(View view){
        Intent intent = new Intent(FrontScreenActivity.this, MainScreen.class);
        startActivity(intent);
    }

    public void OnClickNavigation(View view){
        Intent intent = new Intent(FrontScreenActivity.this, NavigationDrawerActivity.class);
        startActivity(intent);
    }

    public void OnClickTiles(View view){
        Intent intent = new Intent(FrontScreenActivity.this, TilesGridActivity.class);
        startActivity(intent);
    }

    public void OnClickCard(View view){
        Intent intent = new Intent(FrontScreenActivity.this, CardActivity.class);
        startActivity(intent);
    }
}
