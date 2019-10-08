package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindRestaurantsButton= (Button) findViewById(R.id.findRestaurantsbutton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // fais quelque chose
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
//                Toast.makeText(MainActivity.this, "Niceeee :)", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }

}
