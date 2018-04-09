package com.example.downn.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pfun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfun);
        Button sin = (Button)findViewById(R.id.sin);
        Button cos = (Button)findViewById(R.id.cos);
        Button tan = (Button)findViewById(R.id.tan);
        Button squ = (Button)findViewById(R.id.squ);//平方
        Button rad = (Button)findViewById(R.id.rad);//开根
        Button log = (Button)findViewById(R.id.log);//log
        final EditText editText = (EditText)findViewById(R.id.EditText);
        final TextView textView = (TextView)findViewById(R.id.textView);

        sin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String text ;
                String edit = editText.getText().toString();
                try
                {
                    double re = Double.parseDouble(edit);
                    re = Math.sin(re);
                    text = Double.toString(re);
                }catch (RuntimeException r)
                {
                    text = "输入有误";
                }

                textView.setText(text);
            }
        });


        cos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String text ;
                String edit = editText.getText().toString();
                try
                {
                    double re = Double.parseDouble(edit);
                    re = Math.cos(re);
                    text = Double.toString(re);
                }catch (RuntimeException r)
                {
                    text = "输入有误";
                }

                textView.setText(text);
            }
        });

        tan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String text ;
                String edit = editText.getText().toString();
                try
                {
                    double re = Double.parseDouble(edit);
                    re = Math.tan(re);
                    text = Double.toString(re);
                }catch (RuntimeException r)
                {
                    text = "输入有误";
                }

                textView.setText(text);
            }
        });

        squ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String text ;
                String edit = editText.getText().toString();
                try
                {
                    double re = Double.parseDouble(edit);
                    re = re*re;
                    text = Double.toString(re);
                }catch (RuntimeException r)
                {
                    text = "输入有误";
                }

                textView.setText(text);
            }
        });

        rad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String text ;
                String edit = editText.getText().toString();
                try
                {
                    double re = Double.parseDouble(edit);
                    re =Math.sqrt(re);
                    text = Double.toString(re);
                }catch (RuntimeException r)
                {
                    text = "输入有误";
                }

                textView.setText(text);
            }
        });

        log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String text ;
                String edit = editText.getText().toString();
                try
                {
                    double re = Double.parseDouble(edit);
                    re =Math.log(re);
                    text = Double.toString(re);
                }catch (RuntimeException r)
                {
                    text = "输入有误";
                }

                textView.setText(text);
            }
        });

    }

}
