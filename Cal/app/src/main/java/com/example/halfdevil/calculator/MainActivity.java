package com.example.halfdevil.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ADD,SUB,DIVIDE,MUL;
    TextView Result;
    EditText Number1,Number2;

int num1,num2,resultVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = (TextView)findViewById(R.id.Result);
        Number1 = (EditText) findViewById(R.id.Number1);
        Number2 = (EditText) findViewById(R.id.Number2);

        ADD = (Button)findViewById(R.id.ADD);
        SUB = (Button)findViewById(R.id.SUB);
        MUL = (Button)findViewById(R.id.MUL);
        DIVIDE = (Button)findViewById(R.id.DIVIDE);

    ADD.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Integer.parseInt(Number1.getText().toString());
            num2 = Integer.parseInt(Number2.getText().toString());
            resultVal=num1+num2;
            Result.setText(String.valueOf(resultVal));

        }

    });

        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Number2.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                resultVal=num1+num2;
                Result.setText(String.valueOf(resultVal));

            }
        });

        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                resultVal=num1+num2;
                Result.setText(String.valueOf(resultVal));


            }
        });

        DIVIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                resultVal=num1+num2;
                Result.setText(String.valueOf(resultVal));

            }
        });

    }


}
