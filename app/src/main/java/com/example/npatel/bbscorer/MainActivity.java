package com.example.npatel.bbscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int sa = 0, sb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teama = (TextView) findViewById(R.id.sta);
        teamb = (TextView) findViewById(R.id.stb);
        da();
        db();
    }

    TextView teama;
    TextView teamb;

    public void addathree(View v) {
        sa = sa + 3;
        da();
    }


    public void addatwo(View v) {
        sa = sa + 2;
        da();
    }

    public void addaone(View v) {
        sa = sa + 1;
        da();
    }

    public void addbthree(View v) {
        sb = sb + 3;
        db();
    }

    public void addbtwo(View v) {
        sb = sb + 2;
        db();
    }

    public void addbone(View v) {
        sb = sb + 1;
        db();
    }


    public void da() {
        teama.setText(String.valueOf(sa));
    }

    public void db() {
        teamb.setText(String.valueOf(sb));
    }

    public void reset(View v) {
        sa = sb = 0;
        da();
        db();
    }
}