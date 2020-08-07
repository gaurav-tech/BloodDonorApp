package com.example.bdonor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registeration extends AppCompatActivity {
    Button b1,home;
    EditText et1,et2;
    String n,p;
    String b,g;
    private DatabaseReference mDatabse;
    Spinner s1,s2;
    String a[]={"SELECT AVAILABLE BLOOD GROUP","A+","B+","O+"};
    String gen[]={"Gender","Male","Female","Trans"};
    ArrayAdapter adapter;
    ArrayAdapter adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        b1=findViewById(R.id.b1);
        //b2.findViewById(R.id.home);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(registeration.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        adapter=new ArrayAdapter(registeration.this,R.layout.support_simple_spinner_dropdown_item,a);
        s1.setAdapter(adapter);
        adapter1=new ArrayAdapter(registeration.this,R.layout.support_simple_spinner_dropdown_item,gen);

        s2.setAdapter(adapter1);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==1)
                {
                    b="A+";
                }
                else if(i==2)
                {

                    b="B+";

                }
                else if(i==3)
                {
                    b="O+";
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==1)
                {
                    g="Male";

                }
                else if(i==2)
                {

                    g="Female";

                }
                else if(i==3)
                {
                    g="Trans";
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=et1.getText().toString().trim();
                p=et2.getText().toString().trim();

                if (n.equals("") || p.equals("") )
                {
                    showAlertDialogue();

                }

                         else if (b.equals("A+")) {
                         mDatabse= FirebaseDatabase.getInstance().getReference().child("A+/NAME");
                         mDatabse.push().setValue(n);
                         mDatabse= FirebaseDatabase.getInstance().getReference().child("A+/PHONE");
                         mDatabse.push().setValue(p);
                         }
                         else if (b.equals("B+")) {
                         mDatabse= FirebaseDatabase.getInstance().getReference().child("B+/NAME");
                         mDatabse.push().setValue(n);
                         mDatabse= FirebaseDatabase.getInstance().getReference().child("B+/PHONE");
                         mDatabse.push().setValue(p);
                         }
                         else if (b.equals("O+")) {
                         mDatabse= FirebaseDatabase.getInstance().getReference().child("O+/NAME");
                         mDatabse.push().setValue(n);
                         mDatabse= FirebaseDatabase.getInstance().getReference().child("O+/PHONE");
                         mDatabse.push().setValue(p);

                         }
            }

            private void showAlertDialogue() {
                AlertDialog.Builder alert= new AlertDialog.Builder(registeration.this);
                alert.create();
                alert.setMessage("ENTER ALL DETAILS PLEASE TO COMPLETE REGISTRATION");
                alert.setPositiveButton("OK",null);
                alert.setCancelable(false);
                alert.show();
            }
        });


    }
}
