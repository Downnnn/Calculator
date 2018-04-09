package com.example.downn.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class conver extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button0,button_dot,button_ac,button_con;
    TextView hex_text,dec_text,oct_text,bin_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conver);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_dot = (Button) findViewById(R.id.button_dot);
        button_ac= (Button) findViewById(R.id.button_ac);
        button_con = (Button) findViewById(R.id.button_con);
        hex_text = (TextView) findViewById(R.id.hex_text);
        dec_text = (TextView) findViewById(R.id.dec_text);
        oct_text = (TextView) findViewById(R.id.oct_text);
        bin_text = (TextView) findViewById(R.id.bin_text);


        button_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equation = dec_text.getText().toString();
                int num = Integer.parseInt(equation);
                String hex = Integer.toHexString(num);
                String oct = Integer.toOctalString(num);
                String bin = Integer.toBinaryString(num);

                hex_text.setText(hex);
                oct_text.setText(oct);
                bin_text.setText(bin);


            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '0';
                } else {
                    equation = "0";
                }
                dec_text.setText(equation);
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '1';
                } else {
                    equation = "1";
                }
                dec_text.setText(equation);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '2';
                } else {
                    equation = "2";
                }
                dec_text.setText(equation);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '3';
                } else {
                    equation = "3";
                }
                dec_text.setText(equation);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                char c = getLastChar(equation);
                if (check(equation)) {
                    equation += '4';
                } else {
                    equation = "4";
                }
                dec_text.setText(equation);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '5';
                } else {
                    equation = "5";
                }
                dec_text.setText(equation);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '6';
                } else {
                    equation = "6";
                }
                dec_text.setText(equation);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '7';
                } else {
                    equation = "7";
                }
                dec_text.setText(equation);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '8';
                } else {
                    equation = "8";
                }
                dec_text.setText(equation);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = dec_text.getText().toString();
                if (check(equation)) {
                    equation += '9';
                } else {
                    equation = "9";
                }
                dec_text.setText(equation);
            }
        });

        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = "0";
                dec_text.setText(equation);
            }
        });


    }

    public boolean check(String str) {
        if (str.length() == 1) {
            if (str == "(" || str == "-") {
                return true;
            } else {
                int z = Integer.parseInt(str);
                if (z == 0)
                    return false;
            }
        }
        return true;
    }

    public char getLastChar(String equation) {
        String i = "";
        char c;
        if (equation.length() <= 1)
            i = equation;
        else
            i = equation.substring(equation.length() - 1, equation.length());
        c = i.charAt(0);
        return c;
    }


}

