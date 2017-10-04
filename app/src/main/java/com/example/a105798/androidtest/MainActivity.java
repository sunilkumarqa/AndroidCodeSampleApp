package com.example.a105798.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity {
    Button b1;
    EditText ed1,ed2;
    TextView tx1;
    //public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        //Intent i = new Intent(this, HomePage.class);
       // startActivity(i);
       // Button mClickButton1 = (Button)findViewById(R.id.button);
       // mClickButton1.setOnClickListener(MainActivity.this);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,WelcomePage.class));

                }
                }

        });


    }

    //public static void mainMethod()
   // {
     //   startActivity(new Intent(MainActivity.this,WelcomePage.class));
   // }
}
