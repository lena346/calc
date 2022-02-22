package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum;
    Button min;
    Button mul;
    Button del;

    String operator;
    String oldNumber;

    EditText n1;
    EditText n2;
    TextView res;
    EditText editText;

    ImageButton plus;
    ImageButton minus;
    ImageButton multiply;
    ImageButton delen;
    final Boolean[] isNew = {true};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.Num1);
        n2 = (EditText)findViewById(R.id.Num2);
        res = (TextView) findViewById(R.id.Result);
        editText = (EditText)findViewById(R.id.editText);


        int[] buttons = {R.id.button1,R.id.button2, R.id.button3,R.id.button4,R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button0 };


        sum = (Button) findViewById(R.id.sum);
        min = (Button) findViewById(R.id.min);
        mul = (Button) findViewById(R.id.mul);
        del = (Button) findViewById(R.id.del);
        plus = (ImageButton) findViewById(R.id.plus);
        minus = (ImageButton) findViewById(R.id.minus);
        multiply = (ImageButton) findViewById(R.id.multiply);
        delen = (ImageButton) findViewById(R.id.delen);



        for (int id: buttons){
            Button butnum = findViewById(id);
            butnum.setOnClickListener(view -> {
                if (isNew[0])
                    editText.setText("");
                isNew[0] = false;
                editText.setText(String.format("%s%s", editText.getText().toString(), butnum.getText()));
            });
        }
        @SuppressLint("SetTextI18n") View.OnClickListener clickListener = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resSum = num1 + num2;
            res.setText(Integer.toString(resSum));

        };
        sum.setOnClickListener(clickListener);


        @SuppressLint("SetTextI18n") View.OnClickListener clickListener5 = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resPlus = num1 + num2;
            res.setText(Integer.toString(resPlus));

        };
        plus.setOnClickListener(clickListener5);

        @SuppressLint("SetTextI18n") View.OnClickListener clickListener6 = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resMinus = num1 - num2;
            res.setText(Integer.toString(resMinus));

        };
        minus.setOnClickListener(clickListener6);

        @SuppressLint("SetTextI18n") View.OnClickListener clickListener7 = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resMultiply = num1 * num2;
            res.setText(Integer.toString(resMultiply));

        };
        multiply.setOnClickListener(clickListener7);

        @SuppressLint("SetTextI18n") View.OnClickListener clickListener8 = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resDelen = num1 / num2;
            res.setText(Integer.toString(resDelen));

        };
        delen.setOnClickListener(clickListener8);

        @SuppressLint("SetTextI18n") View.OnClickListener clickListener2 = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resMin = num1 - num2;
            res.setText(Integer.toString(resMin));

        };
        min.setOnClickListener(clickListener2);

        @SuppressLint("SetTextI18n") View.OnClickListener clickListener3 = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resMul = num1 * num2;
            res.setText(Integer.toString(resMul));

        };
        mul.setOnClickListener(clickListener3);

        @SuppressLint("SetTextI18n") View.OnClickListener clickListener4 = v -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int resDel = num1 / num2;
            res.setText(Integer.toString(resDel));

        };
        del.setOnClickListener(clickListener4);

    }

    @SuppressLint("NonConstantResourceId")
    public void operation(View view) {
        isNew[0] = true;
        oldNumber = editText.getText().toString();
        switch (view.getId()){
            case R.id.bmn: operator = "-"; break;
            case R.id.bpl: operator = "+" ; break;
            case R.id.bdl: operator = "/" ; break;
            case R.id.bml: operator = "*" ; break;}}



    @SuppressLint("SetTextI18n")
    public void clickEqual(View view) {
        String newNumber = editText.getText().toString();
        double result = 0.0;
        switch (operator) {
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
        editText.setText(result + "");
    }

    public void ACclick(View view) {
        editText.setText("0");
        isNew[0] = true;
        }



}

