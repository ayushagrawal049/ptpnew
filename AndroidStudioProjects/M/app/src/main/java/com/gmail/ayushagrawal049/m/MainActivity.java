package com.gmail.ayushagrawal049.m;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int q=0;
    View view;
    public void a(View view) {
        q=q+1;
        display(q);
    }
    public void b(View view) {
        q=q+2;
        display(q);
    }
    public void c(View view) {
        q=q+5;
        display(q);
    }
    public void d(View view) {
        q=q+10;
        display(q);
    }
    public void e(View view) {
        q=q*0;
        display(q);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.ar);
        quantityTextView.setText("" + number);

        if (q==20)
        {view= this.getWindow().getDecorView();
            view.setBackgroundResource(R.color.green);}
        if (q!=20)
        {view= this.getWindow().getDecorView();
            view.setBackgroundResource(R.color.white);}
        }




}
