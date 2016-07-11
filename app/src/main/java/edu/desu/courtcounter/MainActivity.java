package edu.desu.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int SCORE1 = 0;
    int SCORE2 = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when increasing the score for Team A.
     */

    public void ThreePoint(View view) {
        SCORE1 = SCORE1 + 3;
        display(SCORE1);
    }

    public void TwoPoint(View view) {
        SCORE1 = SCORE1 + 2;
        display(SCORE1);
    }

    public void OnePoint(View view) {
        SCORE1 = SCORE1 + 1;
        display(SCORE1);
    }

    private void display(int number) {
        TextView SCORE1TextView = (TextView) findViewById(R.id.SCORE1);
        SCORE1TextView.setText("" + number);
    }

    /**
     * This method is called when increasing the score for Team B.
     */

    public void ThreePoint2(View view) {
        SCORE2 = SCORE2 + 3;
        display2(SCORE2);
    }

    public void TwoPoint2(View view) {
        SCORE2 = SCORE2 + 2;
        display2(SCORE2);
    }

    public void OnePoint2(View view) {
        SCORE2 = SCORE2 + 1;
        display2(SCORE2);
    }

    private void display2(int number) {
        TextView SCORE2TextView = (TextView) findViewById(R.id.SCORE2);
        SCORE2TextView.setText(String.valueOf((SCORE2)));
    }

    /**
     * This method is the method called for the reset button.
     */

    public void resetButton(View view) {
        SCORE1 = 0;
        SCORE2 = 0;
        display(0);
        display2(0);
    }
}
