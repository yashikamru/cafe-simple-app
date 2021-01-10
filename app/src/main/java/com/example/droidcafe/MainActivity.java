package com.example.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.droidcafe.extra.MESSAGE";
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);fab.setOnClickListener(new View.OnClickListener() {
           @Override
        public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

      //  noinspection SimplifiableIfStatement
        if (id == R.id.action_order) {
           return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    public void displayToast(String message)
    {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }


    public void showDonutOrder(View view)
    {
        mOrderMessage = getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
       // displayToast(getString(R.string.donut_order_message));
    }

    public void showIceCreamOrder(View view)
    {
        mOrderMessage = getString(R.string.ice_cream_order_message);
        displayToast(mOrderMessage);
        //displayToast(getString(R.string.ice_cream_order_message));
    }

    public void showFroyoOrder(View view)
    {
        mOrderMessage = getString(R.string.froyo_order_message);
        displayToast(mOrderMessage);
        //displayToast(getString(R.string.froyo_order_message));
    }

      public void onClick(View view)
    {
        Intent i=new Intent(MainActivity.this,OrderActivtiy.class);
        i.putExtra(EXTRA_MESSAGE,mOrderMessage);
        startActivity(i);
    }
}