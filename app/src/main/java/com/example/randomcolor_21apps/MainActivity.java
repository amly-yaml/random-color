package com.example.randomcolor_21apps;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View mainView;
    private Button mybutton;
    private int[] colorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainView = findViewById(R.id.mainView);
        mybutton = findViewById(R.id.button);
        colorList = new int[] {Color.RED,Color.BLACK, Color.WHITE,
                Color.GREEN, Color.GRAY, Color.DKGRAY, Color.LTGRAY, Color.TRANSPARENT, Color.YELLOW, Color.BLUE, Color.CYAN, Color.MAGENTA};


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int randomColorNumber = random.nextInt(colorList.length);

                mainView.setBackgroundColor(colorList[randomColorNumber]);
                Log.d("Random", String.valueOf(randomColorNumber));  // this is for checking how the programing is working



            }
        });


    }
}
