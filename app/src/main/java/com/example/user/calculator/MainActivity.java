package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, operation;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        operation = (EditText) findViewById(R.id.operation);
        num1 = (EditText) findViewById(R.id.num1);
        answer = (TextView) findViewById(R.id.answer);
    }

    public void equalClicked(View v) {

        double input1 = Double.parseDouble(num1.getText().toString());
        double input2 = Double.parseDouble(num2.getText().toString());

        String operationEntered = operation.getText().toString();

        if (operationEntered.contentEquals("+")) {

            answer.setText(input1 + input2 + "");
        }else if(operationEntered.contentEquals("-")){
            answer.setText(input1-input2 + "");
        }
        else if (operationEntered.contentEquals("*")){

            answer.setText(input1*input2 + "");
        }
        else{
            answer.setText(input1/input2 + "");
        }


    }




}



