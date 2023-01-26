package com.example.attendance_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    String[] a={"Teachers","Staff"};
    Spinner spinner;
    EditText editText;
    String pass1="1234";
    String pass2="12345";
    Button btn;
    int f1=0,f2=0,j1=0,j2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText = findViewById(R.id.text1); // Assume the EditText has the ID "edit_text"

        spinner=findViewById(R.id.SPIN);
        btn=findViewById(R.id.button);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,a);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selected=(String) spinner.getItemAtPosition(i);
                if(i==0)
                {
                    j1=1;
                    j2=0;
                }

                if(i==1) {
                    j1=0;
                    j2 = 1;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j1==1) {
                    if (TextUtils.isEmpty(editText.getText().toString())) {
                        Toast.makeText(Login.this, "Please Fill The Password Field", Toast.LENGTH_SHORT).show();
                    }
                    else if(editText.getText().toString().equals(pass1))
                    {
                        Intent i=new Intent(Login.this,Home.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Login.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                    }
                }
                if(j2==1) {
                    if (TextUtils.isEmpty(editText.getText().toString())) {
                        Toast.makeText(Login.this, "Please Fill The Password Field", Toast.LENGTH_SHORT).show();
                    }
                    else if(editText.getText().toString().equals(pass2))
                    {
                        Intent i=new Intent(Login.this,Home.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Login.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}