package com.example.zawa.test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button yamaBt;
    private Button kawaBt;
    private Button umiBt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yamaBt = (Button) findViewById(R.id.yama);
        yamaBt.setOnClickListener(this);

        kawaBt = (Button) findViewById(R.id.kawa);
        kawaBt.setOnClickListener(this);

        umiBt = (Button) findViewById(R.id.umi);
        umiBt.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.yama){
            Intent intent = new Intent(this, YamaActivity.class);
            startActivity(intent);
        }

        if(v.getId() == R.id.kawa){
            Intent intent = new Intent(this, Kawa.class);
            startActivity(intent);
        }

        if(v.getId() == R.id.umi){
            Intent intent = new Intent(this, Umi.class);
            startActivity(intent);
        }
    }
}
