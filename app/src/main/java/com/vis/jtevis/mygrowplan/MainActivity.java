package com.vis.jtevis.mygrowplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

   DataBaseHelper myDb;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DataBaseHelper (this);

    }
    public void onClickNewPlan (View v)
    {

        if (v.getId() == R.id.CNewPlan)
        {
            Intent i = new Intent(MainActivity.this, NewPlan.class);
            startActivity (i);
        }

    }
    public void onClickManage (View v)
    {

        if (v.getId() == R.id.CManagePlan)
        {
           // Intent i = new Intent(MainActivity.this, create_account.class);
           // startActivity (i);
        }

    }
    public void onClickReport (View v)
    {

        if (v.getId() == R.id.CReport)
        {
           // Intent i = new Intent(MainActivity.this, tourLayout2.class);
           // startActivity (i);
        }

    }
}
