package com.questdot.tablelayoutexample;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TableLayout tableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout=(TableLayout)findViewById(R.id.tableLayout);

        for (int i=0;i<20;i++){
            View tableRow = LayoutInflater.from(this).inflate(R.layout.table_item,null,false);
            TextView tv_no  = (TextView) tableRow.findViewById(R.id.tv_no);
            TextView tv_date  = (TextView) tableRow.findViewById(R.id.tv_date);
            TextView tv_orderid  = (TextView) tableRow.findViewById(R.id.tv_orderid);
            TextView tv_quantity  = (TextView) tableRow.findViewById(R.id.tv_quantity);

            tv_no.setText(""+(i+1));
            tv_date.setText("2016-09-09");
            tv_orderid.setText("A00"+(i+1));
            tv_quantity.setText(""+(100+(i+1)));
            tableLayout.addView(tableRow);
        }
    }
}
