package com.example.cricketapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Sendotp extends AppCompatActivity {

    FirebaseAuth pAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendotp);
        pAuth = FirebaseAuth.getInstance();

        final EditText inputMobile = findViewById(R.id.inputMobile);
        Button buttonGetOTP = findViewById(R.id.getOTP);
        final ProgressBar progressBar = findViewById(R.id.progessBars);

        buttonGetOTP.setOnClickListener(view -> {
            if (inputMobile.getText().toString().trim().isEmpty()){
                Toast.makeText(Sendotp.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
            }

            progressBar.setVisibility(View.VISIBLE);
            buttonGetOTP.setVisibility(View.INVISIBLE);

            PhoneAuthOptions options =
                    PhoneAuthOptions.newBuilder(pAuth)
                            .setPhoneNumber("+92"+ inputMobile.getText().toString())
                            .setTimeout(60L, TimeUnit.SECONDS)
                            .setActivity(Sendotp.this)
                            .setCallbacks(
                    new PhoneAuthProvider.OnVerificationStateChangedCallbacks(){
                        @Override
                        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                            progressBar.setVisibility(View.GONE);
                            buttonGetOTP.setVisibility(View.VISIBLE);

                        }

                        @Override
                        public void onVerificationFailed(@NonNull FirebaseException e) {
                            progressBar.setVisibility(View.GONE);
                            buttonGetOTP.setVisibility(View.VISIBLE);
                            Toast.makeText(Sendotp.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onCodeSent(@NonNull String verificationId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                            progressBar.setVisibility(View.GONE);
                            buttonGetOTP.setVisibility(View.VISIBLE);
                            Intent intent = new Intent(getApplicationContext(),Phoneverify.class);
                            intent.putExtra("mobile","+92"+ inputMobile.getText().toString());
                            intent.putExtra("verificationId",verificationId);
                            startActivity(intent);
                        }
                    })
                            .build();
            PhoneAuthProvider.verifyPhoneNumber(options);
            });
    }
}