package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StartCopy(View view){
        EditText inputField = (EditText) findViewById(R.id.inputTextField);
        TextView existField = (TextView) findViewById(R.id.existTextField);

        existField.setText(inputField.getText().toString());
    }
}
