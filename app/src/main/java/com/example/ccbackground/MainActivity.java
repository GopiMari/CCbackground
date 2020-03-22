package com.example.ccbackground;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView text;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.textID);
        layout=findViewById(R.id.bgID);


        Timer timer = new Timer();

        Mytimer mytime = new Mytimer();

        timer.schedule(mytime,1000,1000);


    }


class Mytimer extends TimerTask{
        public void run()
        {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Random rand = new Random();
                    layout.setBackgroundColor(Color.argb(255,rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
                }
            });

        }
}



}


