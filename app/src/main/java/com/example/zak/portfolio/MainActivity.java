package com.example.zak.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "This button will launch my Spotify Streamer App!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "This button will launch my Scores App!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "This button will launch my Library App!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "This button will launch my Build It Bigger App!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "This button will launch my XYZ Reader App!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "This button will launch my Capstone App!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );


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
