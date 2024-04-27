package com.example.utsandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Kubus extends AppCompatActivity implements ShapeCalculator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kubus);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button calculate= findViewById(R.id.buttonKubusCalculate);
        EditText textinput = findViewById(R.id.textEditKubus);
        TextView textbola=findViewById(R.id.textViewKubus);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputToApp(String.valueOf(calculatevolumeKubus(textinput.getText().toString())),textbola);
            }
        });
    }
    double calculatevolumeKubus(String input){
        Double jari2= Double.valueOf(input);
        return Math.pow(jari2,3);
    }
    @Override
    public void outputToApp(String volume, TextView textView) {
        textView.setText(volume);
    }
}