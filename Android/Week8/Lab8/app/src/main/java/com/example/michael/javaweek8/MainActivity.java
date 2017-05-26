package com.example.michael.javaweek8;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText attempts;
    private EditText completions;
    private EditText yards;
    private EditText interceptions;
    private EditText touchdowns;
    private Button getRating;
    private TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        attempts = (EditText)findViewById(R.id.txtAttempts);
        completions = (EditText)findViewById(R.id.txtCompletions);
        yards = (EditText)findViewById(R.id.txtYards);
        interceptions = (EditText)findViewById(R.id.txtInterceptions);
        touchdowns = (EditText)findViewById(R.id.txtTouchdowns);
        getRating = (Button)findViewById(R.id.btnGetRating);
        answer = (TextView)findViewById(R.id.txtAnswer);

        getRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double attemptsValue = Integer.parseInt(attempts.getText().toString());
                double completionsValue = Integer.parseInt(completions.getText().toString());
                double yardsValue = Integer.parseInt(yards.getText().toString());
                double interceptionsValue = Integer.parseInt(interceptions.getText().toString());
                double touchdownsValue = Integer.parseInt(touchdowns.getText().toString());

                double a = (((completionsValue/attemptsValue) * 100) - 30) / 20;
                double b = ((touchdownsValue/attemptsValue) * 100) / 5;
                double c = (9.5 - ((interceptionsValue / attemptsValue) * 100)) / 4;
                double d = ((yardsValue / attemptsValue) - 3) / 4;



                if(a > 0 && a < 2.375 && b > 0 && b < 2.375 && c > 0 && c < 2.375 && d > 0 && d < 2.375) {
                    double qbRating = (a + b + c + d) / 0.06;
                    answer.setText(Double.toString(qbRating));
                } else {
                    answer.setText("a, b, c and d can not be greater than 2.375 or less than zero.");
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
