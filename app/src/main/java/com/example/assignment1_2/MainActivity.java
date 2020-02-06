package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView candid1,candid2,candidv1,candidv2;
    int c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        candid1=findViewById(R.id.FirstCandid);
        candid2=findViewById(R.id.SecondCandid);
        candidv1=findViewById(R.id.votes1);
        candidv2=findViewById(R.id.votes2);

        c1=0;
        c2=0;
        candid1.setText("Kiran");
        candid2.setText("Febin");
        candidv1.setText(""+c1);
        candidv2.setText(""+c2);

    }


}
