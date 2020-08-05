package com.example.android.milwokreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewNumbers =  findViewById(R.id.numbers);
        textViewNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);
            }
        });

        TextView textViewFamily= findViewById(R.id.family);
        textViewFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, FamilyMembersActivity.class);
             startActivity(intent);
            }
        });

        TextView textViewColors = findViewById(R.id.colors);
        textViewColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
             startActivity(intent);
            }
        });

        TextView textViewPhrases = findViewById(R.id.phrases);
        textViewPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(intent);
            }
        });

    }


}
