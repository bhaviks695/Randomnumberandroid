package com.example.bhavik.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView number;
    Random r= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number=(TextView)findViewById(R.id.textrand);

    }

    public void generate(View v){
        int a=Math.abs(r.nextInt())%100;
        number.setText(String.valueOf(a));
    }
}
