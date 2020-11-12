package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getName();

    private TextView TeamAScore;
    private TextView TeamBScore;

    private Button A3Point;
    private Button A2Point;
    private Button A1Point;

    private Button B3Point;
    private Button B2Point;
    private Button B1Point;

    private Button Reset;

    private int ScoreTeamA;
    private int ScoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TeamAScore = findViewById(R.id.ScoreTeamA);
        TeamBScore = findViewById(R.id.ScoreTeamB);

        A3Point = findViewById(R.id.APoint3);
        A2Point = findViewById(R.id.APoint2);
        A1Point = findViewById(R.id.APoint1);

        B3Point = findViewById(R.id.BPoint3);
        B2Point = findViewById(R.id.BPoint2);
        B1Point = findViewById(R.id.BPoint1);

        Reset = findViewById(R.id.ResetButton);

        A3Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamA = ScoreTeamA + 3;
                TeamAScore.setText(String.valueOf(ScoreTeamA));
            }
        });

        A2Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamA = ScoreTeamA + 2;
                TeamAScore.setText(String.valueOf(ScoreTeamA));
            }
        });

        A1Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamA = ScoreTeamA + 1;
                TeamAScore.setText(String.valueOf(ScoreTeamA));
            }
        });

        B3Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamB = ScoreTeamB +3;
                TeamBScore.setText(String.valueOf(ScoreTeamB));
            }
        });

        B2Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamB = ScoreTeamB + 2;
                TeamBScore.setText(String.valueOf(ScoreTeamB));
            }
        });

        B1Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamB = ScoreTeamB + 1;
                TeamBScore.setText(String.valueOf(ScoreTeamB));
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreTeamA = 0;
                ScoreTeamB = 0;
                TeamAScore.setText("0");
                TeamBScore.setText("0");
            }
        });
    }
}