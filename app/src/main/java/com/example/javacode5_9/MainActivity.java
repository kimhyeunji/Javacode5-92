package com.example.javacode5_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editText.getText().toString();
                textView.setText(inputText);

            }
        });
    }
}