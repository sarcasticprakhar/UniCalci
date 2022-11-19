package com.example.unicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText  = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Response Submitted", Toast.LENGTH_SHORT).show();
               String p= editText.getText().toString();
                int a=Integer.parseInt(p);
                double rup = (a * 81.52);
                textView.setText("The Corresponding Value in Rupee is : " +rup);
            }
        });
    }
}