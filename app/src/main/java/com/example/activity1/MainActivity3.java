package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
String[] simpleq ,simplea, toughq, tougha;
TextView tx1,tx2,tx3,tx4;
Button btn1,btn2,btn3;

int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tx1=findViewById(R.id.xx);
        tx2=findViewById(R.id.yy);
        tx3=findViewById(R.id.que);
        tx4=findViewById(R.id.ans);

        btn1=findViewById(R.id.pre);
        btn1.setOnClickListener(this);

        btn2=findViewById(R.id.showw);
        btn2.setOnClickListener(this);


        btn3=findViewById(R.id.next);
        btn3.setOnClickListener(this);
        simpleq=getResources().getStringArray(R.array.simple_que);
        simplea=getResources().getStringArray(R.array.simple_ans);



index=0;

        tx3.setText(simpleq[index]);
        tx4.setText("press A  for answer");
        tx1.setText(String.valueOf(index+1));
tx2.setText("/"+String.valueOf(simpleq.length));

    }

    @Override
    public void onClick(View v) {


        switch (v.getId())
        {
            case R.id.pre:
                tx4.setText("press A  for answer");
               index--;
               tx3.setText(simpleq[index]);
                tx1.setText(String.valueOf(index+1));
                break;


            case R.id.next:
                tx4.setText("press A For ans");
                index++;
                 tx3.setText(simpleq[index]);
                tx1.setText(String.valueOf(index+1));
 break;
            case R.id.showw:
                tx4.setText(simplea [index]);

                break;
        }
    }
}