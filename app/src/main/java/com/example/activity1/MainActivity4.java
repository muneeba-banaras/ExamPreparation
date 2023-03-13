package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{
    String[]  toughq, tougha;
    TextView tx1,tx2,tx3,tx4;
    Button btn1,btn2,btn3;

    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

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
      toughq=getResources().getStringArray(R.array.tough_que);
        tougha=getResources().getStringArray(R.array.tough_ans);

        index=0;

        tx3.setText(toughq[index]);
        tx4.setText("press A  for answer");
        tx1.setText(String.valueOf(index+1));
        tx2.setText("/"+String.valueOf(toughq.length));



    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.pre:
                tx4.setText("press A  for answer");
                index--;
                tx3.setText(toughq[index]);
                tx1.setText(String.valueOf(index+1));
                break;


            case R.id.next:
                tx4.setText("press A For ans");
                index++;
                tx3.setText(toughq[index]);
                tx1.setText(String.valueOf(index+1));
                break;
            case R.id.showw:
                tx4.setText(tougha[index]);

                break;
        }

    }
}