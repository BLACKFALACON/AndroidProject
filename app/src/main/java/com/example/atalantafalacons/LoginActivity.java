package com.example.atalantafalacons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText Username;
    EditText Password;
    Button Giris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = findViewById(R.id.ac_login_username);
        Password = findViewById(R.id.ac_login_password);
        Giris = findViewById(R.id.ac_login_giris);

        Giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = Username.getText().toString();
                String password = Password.getText().toString();

                if (username.equals("shn") && password.equals("1234")) {
                    Toast.makeText(LoginActivity.this,"Başarıyla giriş yaptınız.",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                if (!username.equals("admin") || !password.equals("admin")) {
                    Toast.makeText(LoginActivity.this,"Kullanıcı adı veya şifre hatalı.",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
