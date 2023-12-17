package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class CalulatorActivity extends AppCompatActivity {

    TextView txtnum,txtsign;

    String op1,op2,operator;
    Double num1,num2,result;
    boolean hashdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calulator);

        txtnum=(TextView) findViewById(R.id.txtnum);
        txtsign=(TextView) findViewById(R.id.txtsign);
        hashdot=false;
    }

    public void btnclicklog(View view) {
        operator="log";
        txtnum.setText(null);
        txtsign.setText("log");
        hashdot=false;
    }

    public void btnclickln(View view) {
        operator="ln";
        txtnum.setText(null);
        txtsign.setText("ln");
        hashdot=false;
    }

    public void btnclicksin(View view) {
        operator="sin";
        txtnum.setText(null);
        txtsign.setText("sin");
        hashdot=false;
    }

    public void btnclickcos(View view) {
        operator="cos";
        txtnum.setText(null);
        txtsign.setText("cos");
        hashdot=false;
    }

    public void btnclicktan(View view) {
        operator="tan";
        txtnum.setText(null);
        txtsign.setText("tan");
        hashdot=false;
    }

    public void btnclickclear(View view) {
        txtnum.setText(null);
        txtsign.setText(null);
        operator=null;
        op1=null;
        op2=null;
        hashdot=false;
    }

    public void btnclickback(View view) {
        if(txtnum.getText().equals("")){
            txtnum.setText(null);
        }else {
            int len=txtnum.getText().length();
            String s=txtnum.getText().toString();
            if(s.charAt(len-1)=='.'){
                hashdot=false;
                txtnum.setText(txtnum.getText().subSequence(0,txtnum.getText().length()-1));
            }else {
                txtnum.setText(txtnum.getText().subSequence(0,txtnum.getText().length()-1));
            }
        }
    }

    public void btnclickper(View view) {
        operator="factorial";
        txtnum.setText(null);
        txtsign.setText("!");
        hashdot=false;
    }

    public void btnclickdivide(View view) {
        operator="/";
        op1=txtnum.getText().toString();
        txtnum.setText(null);
        txtsign.setText("/");
        hashdot=false;
    }

    public void btnclick7(View view) {
        txtnum.setText(txtnum.getText()+"7");
    }

    public void btnclick8(View view) {
        txtnum.setText(txtnum.getText()+"8");
    }

    public void btnclick4(View view) {
        txtnum.setText(txtnum.getText()+"4");
    }

    public void btnclick6(View view) {
        txtnum.setText(txtnum.getText()+"6");
    }

    public void btnclicksub(View view) {
        operator="-";
        op1=txtnum.getText().toString();
        txtnum.setText(null);
        txtsign.setText("-");
        hashdot=false;

    }

    public void btnclick1(View view) {
        txtnum.setText(txtnum.getText()+"1");
    }

    public void btnclick2(View view) {
        txtnum.setText(txtnum.getText()+"2");
    }

    public void btnclick3(View view) {
        txtnum.setText(txtnum.getText()+"3");
    }

    public void btnclickadd(View view) {
        operator="+";
        op1=txtnum.getText().toString();
        txtnum.setText(null);
        txtsign.setText("+");
        hashdot=false;
    }

    public void btnclick0(View view) {
        txtnum.setText(txtnum.getText()+"0");
    }

    public void btnclickdot(View view) {
        if(!hashdot) {
            if(txtnum.getText().equals("")){
                txtnum.setText("0.1");
            }
            else {
                txtnum.setText(txtnum.getText()+".");
            }
            hashdot=true;
        }
    }

    public void btnclickequals(View view) {
        if (operator == null) {
            txtsign.setText("");
        } else if (txtnum.getText().equals("")) {
            txtsign.setText("");
        } else if ((operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) && op1.equals("")) {
            txtsign.setText("");
        } else {
            switch (operator) {
                case "log":
                    op1 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    txtnum.setText("= "+ Math.log10(num1));
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "ln":
                    op1 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    txtnum.setText("= "+ Math.log(num1));
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "factorial":
                    op1 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    int i = Integer.parseInt(op1) - 1;
                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }
                    txtnum.setText("= "+ num1);
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "sin":
                    op1 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    txtnum.setText("= "+ Math.sin(num1));
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "cos":
                    op1 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    txtnum.setText("= "+ Math.cos(num1));
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "tan":
                    op1 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    txtnum.setText("= "+ Math.tan(num1));
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "+":
                    op2 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    num2 = Double.parseDouble(op2);
                    result = num1 + num2;
                    txtnum.setText(result+" ");
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "-":
                    op2 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    num2 = Double.parseDouble(op2);
                    result = num1 - num2;
                    txtnum.setText(result+" ");
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "*":
                    op2 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    num2 = Double.parseDouble(op2);
                    result = num1 * num2;
                    txtnum.setText(result+" ");
                    operator = null;
                    txtsign.setText(null);
                    break;
                case "/":
                    op2 = txtnum.getText().toString();
                    num1 = Double.parseDouble(op1);
                    num2 = Double.parseDouble(op2);
                    if (num2 == 0) {
                        txtnum.setText("Can't Divide By Zero");
                    } else {
                        result = num1 / num2;
                        txtnum.setText(result+" ");
                    }
                    operator = null;
                    txtsign.setText(null);
                    break;
            }
        }
    }

    public void btnclick9(View view) {
        txtnum.setText(txtnum.getText()+"9");
    }

    public void btnclickmul(View view) {
        operator="*";
        op1=txtnum.getText().toString();
        txtnum.setText(null);
        txtsign.setText("x");
        hashdot=false;
    }

    public void btnclick5(View view) {
        txtnum.setText(txtnum.getText()+"5");
    }
}