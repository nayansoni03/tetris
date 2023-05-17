package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //DrawView drawView;
    // GameState gameState;
    RelativeLayout gameButtons;
    Button left;
    Button right;
    Button rotateAc;
    FrameLayout game;
    Button pause;
    TextView score;
    Button difficultyToggle;
    Handler handler;
    Runnable loop;
    int delayFactor;
    int delay;
    int delayLowerLimit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}