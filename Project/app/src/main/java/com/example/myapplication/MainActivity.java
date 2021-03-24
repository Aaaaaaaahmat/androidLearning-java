package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private int zeroAlpha = 100;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;
        zeroAlpha+=10;
        if (zeroAlpha >= 255){
            zeroAlpha = 255;
        }
        findViewById(R.id.button_zero).setBackgroundColor(Color.argb(zeroAlpha, 255, 0, 0));
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void zero(View view) {
        mCount = 0;
        zeroAlpha = 100;
        findViewById(R.id.button_zero).setBackgroundColor(Color.argb(zeroAlpha, 255, 0, 0));
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}