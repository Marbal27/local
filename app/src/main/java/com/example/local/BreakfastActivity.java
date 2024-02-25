package com.example.local;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BreakfastActivity extends AppCompatActivity {
    private Button btn_start;
    private TextView timer_text_view;
    CountDownTimer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        btn_start = findViewById(R.id.button8);
        timer_text_view = findViewById(R.id.textView41);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                }
                btn_start.setText("СБРОС");
                btn_start.setBackgroundColor(Color.RED);
                timer = new CountDownTimer(120000,1000) {
                    @Override
                    public void onTick(long l) {
                        NumberFormat f = new DecimalFormat("00");
                        long sec = l/1000;
                        long min = sec/60;
//                        sec-=min*60;
                        sec = sec%60;
                        String time = f.format(min) + ":" + f.format(sec);
                        timer_text_view.setText(time);
                    }

                    @Override
                    public void onFinish() {
                        timer_text_view.setText("00:00");
                        btn_start.setText("Start");
                        btn_start.setBackgroundColor(Color.BLUE);
                        btn_start.setTextColor(Color.WHITE);
                    }
                };
                timer.start();
            }
        });
    }
}