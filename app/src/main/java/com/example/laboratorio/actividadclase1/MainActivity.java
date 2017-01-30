package com.example.laboratorio.actividadclase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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
    }

    public void sendMessage(View view){
        if(!(first_grade.getText().toString().equals("")) && !(second_grade.getText().toString().equals("")) && !(third_grade.getText().toString().equals(""))){
            fourth_grade.setText(String.valueOf(calculateNote(Double.parseDouble(first_grade.getText().toString()),Double.parseDouble(second_grade.getText().toString()),Double.parseDouble(third_grade.getText().toString()))));
        }
    }
}
