package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText strnum1, strnum2;
    Button add,minus,multi,div;
    TextView result;
    String oper="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strnum1= (EditText) findViewById(R.id.editnum1);
        strnum2= (EditText) findViewById(R.id.editnum2);
        add = (Button) findViewById(R.id.Addbutton);
        minus = (Button) findViewById(R.id.Minusbotton);
        multi = (Button) findViewById(R.id.Multibutton);
        div = (Button) findViewById(R.id.Divbutton);
        result = (TextView) findViewById(R.id.textResult);
    }

    public void onclickbutton(View v)

    {
        float num1=0;
        float num2=0;
        float resultnum=0;
        if(TextUtils.isEmpty(strnum1.getText().toString()) || (TextUtils.isEmpty(strnum2.getText().toString())))

            return;
        num1=Float.parseFloat(strnum1.getText().toString());
        num2=Float.parseFloat(strnum2.getText().toString());

        switch (v.getId()){
            case R.id.Addbutton:  oper="+";
            resultnum = num1+num2;
            break;
            case R.id.Minusbotton:  oper="-";
            resultnum = num1-num2;
            break;
            case R.id.Multibutton:  oper="*";
            resultnum = num1*num2;
            break;
            case R.id.Divbutton: oper="/";
            resultnum = num1/num2;
            break;
            default:break;
            }
            result.setText(num1 + " " + oper + " " + num2 + " = " + resultnum);
    }
}