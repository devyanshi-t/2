package com.example.et.a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s;  EditText ed,ed1;
    String s1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b);
        ed=(EditText)findViewById(R.id.t);
        ed1=(EditText)findViewById(R.id.p);
        b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    s = ed.getText().toString();
                    s1 = ed1.getText().toString();
                    if(s.isEmpty())
                    {Toast.makeText(MainActivity.this,"PLEASE ENTER EMAIL",Toast.LENGTH_LONG).show();}
                         
                    else if(!(s.contains("@")))
                    {Toast.makeText(MainActivity.this,"PLEASE ENTER VALID EMAIL",Toast.LENGTH_LONG).show();}
                    else if(s1.isEmpty())
                    {Toast.makeText(MainActivity.this,"PLEASE ENTER PASSWARD",Toast.LENGTH_LONG).show();}
                    else{
                        Intent it = new Intent(MainActivity.this, Main2Activity.class);
                    it.putExtra("email", s);
                    it.putExtra("passward", s1);
                    startActivity(it);

                }}

            } );
}
    }