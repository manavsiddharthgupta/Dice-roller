package com.manav.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView radomtext;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.roller_button);
        radomtext = findViewById(R.id.random_number);
        imageView = findViewById(R.id.imageView);

    }
    public void dicing(View view) {
        int random = new Random().nextInt(6)+1;
        rollthedice(random);
        Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show();
    }

    private void rollthedice(int random) {
        radomtext.setText(String.valueOf(random));
        switch (random) {
            case 1: imageView.setImageResource(R.drawable.dice1);
            break;
            case 2: imageView.setImageResource(R.drawable.dice2);
            break;
            case 3: imageView.setImageResource(R.drawable.dice3);
            break;
            case 4: imageView.setImageResource(R.drawable.dice4);
            break;
            case 5: imageView.setImageResource(R.drawable.dice5);
            break;
            case 6: imageView.setImageResource(R.drawable.dice6);
            break;

        }
    }
}