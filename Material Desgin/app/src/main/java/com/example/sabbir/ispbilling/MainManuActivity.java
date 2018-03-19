package com.example.sabbir.ispbilling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainManuActivity extends AppCompatActivity {


    ///CardView ;

    ImageView addButton, showButton,CheckButton,DeleteButton,About,Bill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_manu);


       addButton = findViewById(R.id.add_image);
        showButton = findViewById(R.id.show_user_image);
        CheckButton = findViewById(R.id.Check_payment_image);
        DeleteButton = findViewById(R.id.delete_user_image);
        Bill = findViewById(R.id.bill_payment_user);
        About = findViewById(R.id.about_image);

        MainMethod();
    }


   protected void MainMethod()
    {



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainManuActivity.this,AddListActivity.class);
                startActivity(intent);

                Toast.makeText(MainManuActivity.this, "This is the card view",Toast.LENGTH_SHORT).show();
            }
        });


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainManuActivity.this,ShowListActivity.class);
                startActivity(intent);
            }
        });

        CheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainManuActivity.this,CheckPaymentActivity.class);
                startActivity(intent);
            }
        });

        DeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainManuActivity.this,DeleteActivity.class);
                startActivity(intent);
            }
        });

        Bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainManuActivity.this,BillPaymentActivity.class);
                startActivity(intent);
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainManuActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

    }

}
