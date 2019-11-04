package com.example.amst6;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<SplashActivity> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread timer= new Thread()
        {
            public void run()
            {
                try
                {
                    //Display for 3 seconds
                    sleep(3000);


                }
                catch (InterruptedException e)
                {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally
                {
                    //Goes to Activity  StartingPoint.java(STARTINGPOINT)
                    Intent intent = new Intent(MainActivity.this, MenuLateral.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();

    }
}
