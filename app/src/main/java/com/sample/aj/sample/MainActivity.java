package com.sample.aj.sample;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView res;
    Button btnAdd,btnnew,btnclean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        n1=(EditText)findViewById(R.id.num1);
        n2=(EditText)findViewById(R.id.num2);
        res=(TextView)findViewById(R.id.result);
        btnAdd=(Button)findViewById(R.id.btn);
        btnnew=(Button)findViewById(R.id.btnnew);
        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try
                {
                    int a = Integer.parseInt(n1.getText().toString());
                    int b = Integer.parseInt(n2.getText().toString());
                    int c = a + b;
                    res.setText(Integer.toString(c));
                }catch(Exception e){
                    Toast a=Toast.makeText(getBaseContext(),"Please enter valid numbers",Toast.LENGTH_LONG);
                    a.show();
                }
            }
        });
        btnnew.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setContentView(new SingleTouchEventView(getApplicationContext(),null));

            }
        });
    }
    public void onBackPressed()
    {
            setContentView(new SingleTouchEventView(getApplicationContext(), null));
            Toast a=Toast.makeText(getBaseContext(),"Press Home button to exit",Toast.LENGTH_SHORT);
            a.show();
    }
}
