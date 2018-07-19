package com.example.et.a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       TextView tv1=(TextView)findViewById(R.id.t1);
       TextView tv2=(TextView)findViewById(R.id.t2);
        Intent intent = getIntent();
      //  Intent intent1 = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            String email = (String) bundle.get("email");
            String password = (String) bundle.get("passward");
            tv1.setText("YOUR EMAIL IS "+email);

            tv2.setText("YOUR PASSWARD IS "+password);}
       // String str = intent.getStringExtra("email");
       //String str1=intent.getStringExtra("passward");
       //v1.setText(str);
        //tv2.setText(str1);

       // tv1.setText(getIntent().getStringExtra("email"));
        //tv2.setText(getIntent().getStringExtra("passward"));


    }
}
