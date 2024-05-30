package com.example.customdialogsecondexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint("MissingInflatedId") Button btnclick = findViewById(R.id.btnclick);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.activity2);
                Button btnlog =findViewById(R.id.btnlogin);
                Button btncancel= findViewById(R.id.btncancel);
                TextView userName= dialog.findViewById(R.id.etuser);
                TextView password= dialog.findViewById(R.id.etpassword);
                String User = userName.getText().toString();
                String Password = password.getText().toString();
                btnlog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Successfully Login", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    }
                });
                btncancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Cancelled", Toast.LENGTH_SHORT).show();
                  dialog.dismiss();  }
                });
            }
        });

    }
}