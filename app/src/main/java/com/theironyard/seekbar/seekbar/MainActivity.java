package com.theironyard.seekbar.seekbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = (TextView) findViewById(R.id.resultID);
        seekBar = (SeekBar) findViewById(R.id.seekBarID);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               // Log.d("SB", "OnProgress!");
                resultTextView.setText("Pain Level: " + seekBar.getProgress() + "/" + seekBar.getMax());

                if (seekBar.getProgress() <= 6) {
                    resultTextView.setTextColor(Color.GRAY);
                }
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
              //  Log.d("SB", "OnStartTrackingTouch!!");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                if (seekBar.getProgress() >= 7) {
                    resultTextView.setTextColor(Color.RED);
                }
               // Log.d("SB", "OnStopTrackingTouch!!");

            }
        });

    }
}
