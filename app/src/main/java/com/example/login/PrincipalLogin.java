package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Principal;

public class PrincipalLogin extends AppCompatActivity {
    private EditText user,pass;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_login);

        user = (EditText)findViewById(R.id.txt_nombre);
        pass = (EditText)findViewById(R.id.txt_password);
        btnlogin=(Button)findViewById(R.id.button);



        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("juan") && pass.getText().toString().equals("123456")){
                    
                                 Intent btnlogin = new Intent(PrincipalLogin.this,segunda_actividad.class);
                                       startActivity(btnlogin);
                }else{
                    Toast.makeText(PrincipalLogin.this, "Datos Incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}