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

public class Pyramid extends AppCompatActivity implements ShapeCalculator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pyramid);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button calculate= findViewById(R.id.buttonPyramidCalculate);
        EditText textinputsisi = findViewById(R.id.textEditPyramidSisi);
        EditText textinputtinggi = findViewById(R.id.textEditPyramidTinggi);
        TextView textpyramid=findViewById(R.id.textViewPyramid);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputToApp(String.valueOf(calculatevolumePyramid(textinputsisi.getText().toString(),textinputtinggi.getText().toString())),textpyramid);
            }
        });
    }
    double calculatevolumePyramid(String input,String input2){
        Double sisi= Double.valueOf(input);
        Double tinggi = Double.valueOf(input2);
        return tinggi*sisi*sisi/3;
    }
    @Override
    public void outputToApp(String volume, TextView textView) {
        textView.setText(volume);
    }
}