package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dailyCasesNumBox = findViewById(R.id.dailyCasesNum);
        dailyCasesNumBox.setText("300000");

        TextView dailyDeathsNumBox = findViewById(R.id.dailyDeathsNum);
        dailyDeathsNumBox.setText("30000");

        TextView dailyRecoveredNumBox = findViewById(R.id.dailyRecoveredNum);
        dailyRecoveredNumBox.setText("200000");


    }

    public void goToNextScreen(View view){
        setContentView(R.layout.next_screen);
    }
/*
    public void onClickSubmitButton(View view){

        EditText editText = findViewById(R.id.userNameInput);
        String username = editText.getText().toString();
        Log.i("submit", "username entered" + username);
        TextView textView = findViewById(R.id.displayUsername);
        textView.setText(username);
    }*/


    // Ok i'll just add a comment
}