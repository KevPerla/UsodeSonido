package com.example.numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class numeros_espanol extends AppCompatActivity  implements View.OnClickListener {
    ImageButton uno, dos, tres, cuatro, cinco, seis, siete, ochp, nueve, diez;
    Button regresar;
    private MediaPlayer nuno, ndos, ntres, ncuatro, ncinco, nseis, nsiete, nocho, nnueve, ndiez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_espanol);

        nuno = MediaPlayer.create(numeros_espanol.this, R.raw.uno);
        ndos = MediaPlayer.create(numeros_espanol.this, R.raw.dos);
        ntres = MediaPlayer.create(numeros_espanol.this, R.raw.tres);
        ncuatro = MediaPlayer.create(numeros_espanol.this, R.raw.cuatro);
        ncinco = MediaPlayer.create(numeros_espanol.this, R.raw.cinco);
        nseis = MediaPlayer.create(numeros_espanol.this, R.raw.seis);
        nsiete = MediaPlayer.create(numeros_espanol.this, R.raw.siete);
        nocho = MediaPlayer.create(numeros_espanol.this, R.raw.ocho);
        nnueve = MediaPlayer.create(numeros_espanol.this, R.raw.nueve);
        ndiez = MediaPlayer.create(numeros_espanol.this, R.raw.diez);

        uno = (ImageButton) findViewById(R.id.uno);
        uno.setOnClickListener(this);

        dos = (ImageButton) findViewById(R.id.dos);
        dos.setOnClickListener(this);

        tres = (ImageButton) findViewById(R.id.tres);
        tres.setOnClickListener(this);

        cuatro = (ImageButton) findViewById(R.id.cuatro);
        cuatro.setOnClickListener(this);

        cinco = (ImageButton) findViewById(R.id.cinco);
        cinco.setOnClickListener(this);

        seis = (ImageButton) findViewById(R.id.seis);
        seis.setOnClickListener(this);

        siete = (ImageButton) findViewById(R.id.siete);
        siete.setOnClickListener(this);

        ochp = (ImageButton) findViewById(R.id.ocho);
        ochp.setOnClickListener(this);

        nueve = (ImageButton) findViewById(R.id.nueve);
        nueve.setOnClickListener(this);

        diez = (ImageButton) findViewById(R.id.diez);
        diez.setOnClickListener(this);

        regresar = (Button) findViewById(R.id.Btnregresar);
        regresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.uno) {
            nuno.start();
        } else if (v.getId() == R.id.dos) {
            ndos.start();
        } else if (v.getId() == R.id.tres) {
            ntres.start();
        } else if (v.getId() == R.id.cuatro) {
            ncuatro.start();
        } else if (v.getId() == R.id.cinco) {
            ncinco.start();
        } else if (v.getId() == R.id.seis) {
            nseis.start();
        } else if (v.getId() == R.id.siete) {
            nsiete.start();
        } else if (v.getId() == R.id.ocho) {
            nocho.start();
        } else if (v.getId() == R.id.nueve) {
            nnueve.start();
        } else if (v.getId() == R.id.diez) {
            ndiez.start();
        } else if (v.getId() == R.id.Btnregresar) {
            finish();
        }
    }
}