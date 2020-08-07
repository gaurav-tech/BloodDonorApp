package com.example.bdonor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference mdatabase;
    Button b2,b3,b4;
    Button open;
    private ArrayList<String> name=new ArrayList<>();
    private ArrayList<String> phone=new ArrayList<>();
    private int pos;
     RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open=findViewById(R.id.reg);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        //b5=findViewById(R.id.clear);
        rv=findViewById(R.id.rv);
       open.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent  intent=new Intent(MainActivity.this,registeration.class);
               startActivity(intent);
           }
       });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rv.removeAllViewsInLayout();
                mdatabase= FirebaseDatabase.getInstance().getReference().child("A+/NAME");

                mdatabase.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {


                        String val=dataSnapshot.getValue(String.class);
                        name.add(val);


                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                mdatabase= FirebaseDatabase.getInstance().getReference().child("A+/PHONE");
               mdatabase.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

               String val1=dataSnapshot.getValue(String.class);
               phone.add(val1);


               }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });



               // String values[]={"use fire","or use whichever comfortable","rj","sm"};
              //  String values2[]={"Rj","or use whichever comfortable","rj","sm"};

                rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                rv.setAdapter(new pAdapter(MainActivity.this,name,phone));
               // rv.setAdapter(new pAdapter(getApplicationContext()));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rv.removeAllViewsInLayout();
                mdatabase= FirebaseDatabase.getInstance().getReference().child("B+/NAME");

                mdatabase.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        String val=dataSnapshot.getValue(String.class);
                        name.add(val);

                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                mdatabase= FirebaseDatabase.getInstance().getReference().child("B+/PHONE");
                mdatabase.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        String val=dataSnapshot.getValue(String.class);
                        phone.add(val);
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });



                // String values[]={"use fire","or use whichever comfortable","rj","sm"};
                //  String values2[]={"Rj","or use whichever comfortable","rj","sm"};

                rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                rv.setAdapter(new pAdapter(MainActivity.this,name,phone));


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rv.removeAllViewsInLayout();
                mdatabase= FirebaseDatabase.getInstance().getReference().child("O+/NAME");

                mdatabase.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        String val=dataSnapshot.getValue(String.class);
                        name.add(val);

                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                mdatabase= FirebaseDatabase.getInstance().getReference().child("O+/PHONE");
                mdatabase.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        String val=dataSnapshot.getValue(String.class);
                        phone.add(val);
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


                rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                rv.setAdapter(new pAdapter(MainActivity.this,name,phone));
            }
        });




    }
}
