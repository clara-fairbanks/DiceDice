/**
 * Four global variables to store:
 the user's overall score state
 the user's turn score
 the computer's overall score
 the computer's turn score
 A click handler for the "Roll" button that will:
 randomly select a dice value
 update the display to reflect the rolled value
 Use getResources().getDrawable in order to programmatically access other images. This functionality will also be needed for the computer turn so a helper function to roll the die may be useful to implement.


 */

package com.example.clarafairbanks.dicedice;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int userScore = 0;
        int compScore = 0;
        int turnScore = 0;
        int compTurn = 0;
        final boolean gameOver = false;
        final boolean userTurn = true;

        Button rollButton = (Button) findViewById(R.id.rollButton);
        rollButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (userTurn && !gameOver) {
                    roll();
                }
            }
        });

        Button holdButton = (Button) findViewById(R.id.holdButton);
        holdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                if (userTurn && !gameOver) {
                hold();
//                    updateScore();
//                    if (!gameOver) computerTurn();
//                }
            }
        });

        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                reset();
            }
        });
    }

    public void roll(){}

    public void hold(){}

    public void reset(){}

}
