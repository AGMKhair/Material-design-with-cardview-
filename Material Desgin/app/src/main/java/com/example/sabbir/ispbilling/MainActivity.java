package com.example.sabbir.ispbilling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username, password;
    Button button;
    TextView textView ;
    String user = "kobir";
    String pass = "kobir77";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = findViewById(R.id.loginbutton);
        username = findViewById(R.id.EditText_Login_User);
        password = findViewById(R.id.EditText_Login_Password);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals(user) && password.getText().toString().equals(pass))
                {
                    Intent intent = new Intent(MainActivity.this,MainManuActivity.class);
                     startActivity(intent);
                }else
                {
                    Toast.makeText(MainActivity.this,"Wrong Password or User Id ", Toast.LENGTH_SHORT).show();
                }
                username.setText("");
                username.setHint("User Name/kobir");
                password.setText("");
                password.setHint("Password/kobir77");

            }
        });



    }
}
