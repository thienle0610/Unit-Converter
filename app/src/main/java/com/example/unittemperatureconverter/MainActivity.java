package com.example.unittemperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    EditText number;
    TextView result;
    Double temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number =(EditText) findViewById(R.id.textNumber);

        button1 = (Button) findViewById(R.id.CtoF);

        button2 = (Button) findViewById(R.id.FtoC);

        result = (TextView) findViewById(R.id.resultText);

        DecimalFormat format = new DecimalFormat("#.##");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp=Double.parseDouble(String.valueOf(number.getText()));
                Double newTemp = temp*9/5+32;
                result.setText(format.format(newTemp) + "°F");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp=Double.parseDouble(String.valueOf(number.getText()));
                Double newTemp = (temp-32)*5/9;
                result.setText(format.format(newTemp) + "°C");
            }
        });
    }
}