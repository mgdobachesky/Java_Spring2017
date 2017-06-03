package com.example.michael.javaweek9lab;

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

    private EditText numberToBuy;
    private EditText itemCost;
    private EditText minimum;
    private EditText percent;
    private EditText numberToBuyForDiscount;
    private Button caluculateDiscounts;
    private TextView bulkSavings;
    private TextView buyNSavings;
    private BulkDiscount bulkDiscount;
    private BuyNItemsGetOneFree buyNItemsGetOneFree;

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

        numberToBuy = (EditText)findViewById(R.id.txtNumberToBuy);
        itemCost = (EditText)findViewById(R.id.txtItemCost);
        minimum = (EditText)findViewById(R.id.txtMinimum);
        percent = (EditText)findViewById(R.id.txtPercent);
        numberToBuyForDiscount = (EditText)findViewById(R.id.txtNumberToBuyForDiscount);
        caluculateDiscounts = (Button)findViewById(R.id.btnCalculateDiscounts);
        bulkSavings = (TextView)findViewById(R.id.txtBulkSavings);
        buyNSavings = (TextView)findViewById(R.id.txtBuyNSavings);

        caluculateDiscounts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int dataNumberToBuy = Integer.parseInt(numberToBuy.getText().toString());
                float dataItemCost = Integer.parseInt(itemCost.getText().toString());
                int dataMinimum = Integer.parseInt(minimum.getText().toString());
                float dataPercent = Integer.parseInt(percent.getText().toString());
                int dataNumberToBuyForDiscount = Integer.parseInt(numberToBuyForDiscount.getText().toString());

                bulkDiscount = new BulkDiscount(dataMinimum, dataPercent);
                buyNItemsGetOneFree = new BuyNItemsGetOneFree(dataNumberToBuyForDiscount);

                bulkSavings.setText(Float.toString(bulkDiscount.computeDiscount(dataNumberToBuy, dataItemCost)));
                buyNSavings.setText(Float.toString(buyNItemsGetOneFree.computeDiscount(dataNumberToBuy, dataItemCost)));
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
