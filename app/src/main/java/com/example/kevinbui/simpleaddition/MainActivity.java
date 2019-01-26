package com.example.kevinbui.simpleaddition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference addBtn
        Button addBtn = (Button) findViewById(R.id.addBtn);
        // Assign onclick listener
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // on click event
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText); // First Num
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText); // Second text
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                // Convert string to number (parse),.get text out, and convert to string
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + ""); // Output


            }
        });
    }
}
