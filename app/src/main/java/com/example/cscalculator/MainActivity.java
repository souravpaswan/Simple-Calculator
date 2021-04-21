package com.example.cscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button1, button2, button3, button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.val1);
        editText2 = (EditText) findViewById(R.id.val2);
        button1 = (Button) findViewById(R.id.add);
        button2 = (Button) findViewById(R.id.sub);
        button3 = (Button) findViewById(R.id.mul);
        button4 = (Button) findViewById(R.id.div);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String v1 = editText1.getText().toString();
                String v2 = editText2.getText().toString();

                if(v1.isEmpty() || v2.isEmpty())
                    Toast.makeText(getApplicationContext(), "Empty fields aren't allowed!", Toast.LENGTH_SHORT).show();
                else 
                {
                    double a = Double.parseDouble(v1);
                    double b = Double.parseDouble(v2);
                    double sum = a + b;

                    String value = Double.toString(sum);

                    if (sum%1==0)
                        value = value.substring(0, value.indexOf('.'))

                    Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String v1 = editText1.getText().toString();
                String v2 = editText2.getText().toString();

                if(v1.isEmpty() || v2.isEmpty())
                    Toast.makeText(getApplicationContext(), "Empty fields aren't allowed!", Toast.LENGTH_SHORT).show();
                else {
                    double a = Double.parseDouble(v1);
                    double b = Double.parseDouble(v2);
                    double sub = a - b;

                    String value = Double.toString(sub);

                    if (value.charAt(value.indexOf('.') + 1) == '0')
                        value = value.substring(0, value.indexOf('.'));


                    Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String v1 = editText1.getText().toString();
                String v2 = editText2.getText().toString();

                if(v1.isEmpty() || v2.isEmpty())
                    Toast.makeText(getApplicationContext(), "Empty fields aren't allowed!", Toast.LENGTH_SHORT).show();

                else {
                    double a = Double.parseDouble(v1);
                    double b = Double.parseDouble(v2);
                    double mul = a * b;

                    String value = Double.toString(mul);

                    if (value.charAt(value.indexOf('.') + 1) == '0')
                        value = value.substring(0, value.indexOf('.'));


                    Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
                }
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String v1 = editText1.getText().toString();
                String v2 = editText2.getText().toString();

                if(v1.isEmpty() || v2.isEmpty())
                    Toast.makeText(getApplicationContext(), "Empty fields aren't allowed!", Toast.LENGTH_SHORT).show();
                else
                {
                    double a = Double.parseDouble(v1);
                    double b = Double.parseDouble(v2);
                    double div = a / b;
                    String value= Double.toString(div);
                    if(value.charAt(value.indexOf('.')+1)=='0')
                        value=value.substring(0,value.indexOf('.'));
                    Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
