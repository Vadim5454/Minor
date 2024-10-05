package com.example.hoooh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextTextPassword);


        if (savedInstanceState != null) {
            String email = savedInstanceState.getString("email");
            String password = savedInstanceState.getString("password");
            emailEditText.setText(email);
            passwordEditText.setText(password);
        }
    }

    @Override

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("email", emailEditText.getText().toString());
        outState.putString("password", passwordEditText.getText().toString());
        Button button = findViewById(R.id.sign_in_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinalActivity.this, Screeeeeen.class);
                startActivity(intent);
            }
        }
    ;}
}