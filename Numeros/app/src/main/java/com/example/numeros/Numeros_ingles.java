package com.example.numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Numeros_ingles extends AppCompatActivity implements View.OnClickListener{

    ImageButton one, two, three, four, five, six, seven, eight, nine, ten;
    Button regresar;
    private MediaPlayer none,ntwo, nthree,nfour,nfive, nsix, nseven, neight, nnine, nten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_ingles);

        none = MediaPlayer.create(Numeros_ingles.this,R.raw.au_one);
        ntwo = MediaPlayer.create(Numeros_ingles.this,R.raw.two);
        nthree = MediaPlayer.create(Numeros_ingles.this,R.raw.three);
        nfour = MediaPlayer.create(Numeros_ingles.this,R.raw.four);
        nfive = MediaPlayer.create(Numeros_ingles.this,R.raw.five);
        nsix = MediaPlayer.create(Numeros_ingles.this,R.raw.six);
        nseven = MediaPlayer.create(Numeros_ingles.this,R.raw.seven);
        neight = MediaPlayer.create(Numeros_ingles.this,R.raw.eight);
        nnine = MediaPlayer.create(Numeros_ingles.this,R.raw.nine);
        nten = MediaPlayer.create(Numeros_ingles.this,R.raw.ten);

        one = (ImageButton) findViewById(R.id.one);
        one.setOnClickListener(this);

        two = (ImageButton) findViewById(R.id.two);
        two.setOnClickListener(this);

        three = (ImageButton) findViewById(R.id.three);
        three.setOnClickListener(this);

        four = (ImageButton) findViewById(R.id.four);
        four.setOnClickListener(this);

        five = (ImageButton) findViewById(R.id.five);
        five.setOnClickListener(this);

        six = (ImageButton) findViewById(R.id.six);
        six.setOnClickListener(this);

        seven = (ImageButton) findViewById(R.id.seven);
        seven.setOnClickListener(this);

        eight = (ImageButton) findViewById(R.id.eight);
        eight.setOnClickListener(this);

        nine = (ImageButton) findViewById(R.id.nine);
        nine.setOnClickListener(this);

        ten = (ImageButton) findViewById(R.id.ten);
        ten.setOnClickListener(this);

        regresar = (Button) findViewById(R.id.Btnregresar);
        regresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.one) {
            none.start();
        } else if (view.getId() == R.id.two) {
            ntwo.start();
        } else if (view.getId() == R.id.three) {
            nthree.start();
        } else if (view.getId() == R.id.four) {
            nfour.start();
        } else if (view.getId() == R.id.five) {
            nfive.start();
        } else if (view.getId() == R.id.six) {
            nsix.start();
        } else if (view.getId() == R.id.seven) {
            nseven.start();
        } else if (view.getId() == R.id.eight) {
            neight.start();
        } else if (view.getId() == R.id.nine) {
            nnine.start();
        } else if (view.getId() == R.id.ten) {
            nten.start();
        } else if (view.getId() == R.id.Btnregresar) {
            finish();
        }
    }
}