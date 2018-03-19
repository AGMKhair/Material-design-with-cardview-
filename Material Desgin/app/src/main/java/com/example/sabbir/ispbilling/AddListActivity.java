package com.example.sabbir.ispbilling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddListActivity extends AppCompatActivity {

    
    EditText idNumber,userName,PhoneNumber,Address;
    CheckBox activity;
    Button submit;
    
    
    DatabaseReference databaseArtists;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list);

        databaseArtists = FirebaseDatabase.getInstance().getReference("Sabbir");
        
        idNumber = findViewById(R.id.Add_id_Number);
        userName = findViewById(R.id.Add_Name);
        PhoneNumber = findViewById(R.id.Add_PhoneNuber);
        Address = findViewById(R.id.Add_Address);
        submit = findViewById(R.id.Add_Button);
        activity = findViewById(R.id.Add_Activity);
        
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // addmethod();
            }
        });


    }

    private void addmethod() {

        String id = idNumber.getText().toString().trim();
        String name = userName.getText().toString().trim();
        String phoneNumber =  PhoneNumber.getText().toString();

        if(!TextUtils.isEmpty(id))
        {

            String idm = databaseArtists.push().getKey();

            Artist artist = new Artist(id,name,phoneNumber);

            databaseArtists.child(idm).setValue(artist);

            Toast.makeText(AddListActivity.this," Complite ", Toast.LENGTH_SHORT).show();


        }
        else
        {
            Toast.makeText(AddListActivity.this,"Uou should entri a name ", Toast.LENGTH_SHORT).show();
        }

    }

}
