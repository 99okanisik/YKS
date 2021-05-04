package com.okanisik.yks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


      CardView sorular1 = findViewById(R.id.cardviewA);
        // Set a click listener on that View
        sorular1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, iletisimActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });

    }




    /*

              <TextView
                                    android:id="@+id/sorular"
                                    android:layout_width="wrap_content"
                                    android:layout_height="wrap_content"
                                    android:layout_gravity="center"
                                    android:gravity="center"
                                    android:padding="2dp"
                                    android:text="Sorular"
                                    android:textColor="@color/black"
                                    android:textSize="22sp" />

     */




}