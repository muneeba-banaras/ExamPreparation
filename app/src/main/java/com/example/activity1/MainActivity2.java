package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity  implements View.OnClickListener {
TextView tx;
Button btn,btn2,btn3, btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tx=findViewById(R.id.receive);
        Intent i=getIntent();
        String str=i.getStringExtra("msg");
        tx.setText(str);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn4=findViewById(R.id.button5);
        btn4.setOnClickListener(this);
        btn5=findViewById(R.id.button6);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch ( v.getId())
        {
            case R.id.button:
                Intent i=new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
                break;
            case  R.id.button2:
                Intent j=new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(j);
                break;
                case R.id.button3:
                    Intent map= new Intent(Intent.ACTION_VIEW);
                    map.setData(Uri.parse("https://maps.app.goo.gl/GUToL8PVPN4gsmYH8"));
                    if(map.resolveActivity(getPackageManager() )!=null)
                    {
                        startActivity(map);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"no apps available",Toast.LENGTH_SHORT).show();
                    }

                    break;

            case  R.id.button5:
            case  R.id.button6:
                try {
                      Uri u=Uri.parse("https://play.google.com/store/apps/details?id=com.accordion.pro.camera" );
                      Intent k= new Intent(Intent.ACTION_VIEW,u);
                      startActivity(k);
                  }
                  catch (ActivityNotFoundException e) {
                      Uri u=Uri.parse("https://play.google.com/store/apps/details?id=com.accordion.pro.camera" );
                      Intent k= new Intent(Intent.ACTION_VIEW,u);
                      startActivity(k);
                  }
          break;

        }
    }
}