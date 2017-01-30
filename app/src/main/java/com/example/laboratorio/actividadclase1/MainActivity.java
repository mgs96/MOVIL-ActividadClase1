package com.example.laboratorio.actividadclase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText first_grade;
    private EditText second_grade;
    private EditText third_grade;
    private TextView fourth_grade;

    private double calculateNote(double f, double s, double t){
        return (3.5 - ((f + s + t) * 0.25)) / 0.25;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_grade = (EditText) findViewById(R.id.first_grade);
        second_grade = (EditText) findViewById(R.id.second_grade);
        third_grade = (EditText) findViewById(R.id.third_grade);
        fourth_grade = (TextView) findViewById(R.id.fourth_grade);

        first_grade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(!(first_grade.getText().toString().equals("")) && !(second_grade.getText().toString().equals("")) && !(third_grade.getText().toString().equals(""))){
                    fourth_grade.setText(String.valueOf(calculateNote(Double.parseDouble(first_grade.getText().toString()),Double.parseDouble(second_grade.getText().toString()),Double.parseDouble(third_grade.getText().toString()))));
                }
            }
        });

        second_grade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(!(first_grade.getText().toString().equals("")) && !(second_grade.getText().toString().equals("")) && !(third_grade.getText().toString().equals(""))){
                    fourth_grade.setText(String.valueOf(calculateNote(Double.parseDouble(first_grade.getText().toString()),Double.parseDouble(second_grade.getText().toString()),Double.parseDouble(third_grade.getText().toString()))));
                }

            }
        });

        third_grade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(!(first_grade.getText().toString().equals("")) && !(second_grade.getText().toString().equals("")) && !(third_grade.getText().toString().equals(""))){
                    fourth_grade.setText(String.valueOf(calculateNote(Double.parseDouble(first_grade.getText().toString()),Double.parseDouble(second_grade.getText().toString()),Double.parseDouble(third_grade.getText().toString()))));
                }

            }
        });
    }


}
