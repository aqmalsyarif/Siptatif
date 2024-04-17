package com.aqmal.siptatif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class LupaPassword extends AppCompatActivity {

    private Button buttonReset;
    private Button loginBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        buttonReset = findViewById(R.id.buttonReset);
        loginBack = findViewById(R.id.buttonKembaliLogin);
        ImageView backButton = findViewById(R.id.Back);

        loginBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LupaPassword.this, ResetPassword.class);
                startActivity(intent);
                Toast.makeText(LupaPassword.this, "Link dikirim ke email", Toast.LENGTH_SHORT).show();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


}