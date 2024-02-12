package com.example.ejemploooguia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer reproductor;
    ImageView imgBoton, imgBotonStop;
    Button btnRemoto, btnLocal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBoton = findViewById(R.id.imb1);
        imgBotonStop = findViewById(R.id.imb2);
        imgBoton.setVisibility(View.INVISIBLE);
        imgBotonStop.setVisibility(View.INVISIBLE);
        btnLocal = findViewById(R.id.btnLocal);
        btnRemoto = findViewById(R.id.btnRemoto);

        btnLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reproductor!=null){
                    if(reproductor.isPlaying()){
                        reproductor.release();
                        reproductor = null;
                    }
                }
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.cancion_test);
                reproductor.start();
                imgBoton.setVisibility(View.VISIBLE);
                imgBoton.setImageResource(R.drawable.boton_pausar);
                imgBotonStop.setVisibility(View.VISIBLE);
            }
        });

        btnRemoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(reproductor!=null){
                        if(reproductor.isPlaying()){
                            reproductor.release();
                            reproductor = null;
                        }
                    }
                    reproductor = new MediaPlayer();
                    String URL = "https://tonosmovil.net/wp-content/uploads/tonosmovil.net_himno_champions_league.mp3";
                    reproductor.setAudioAttributes(
                            new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build()
                    );
                    reproductor.setDataSource(URL);
                    reproductor.prepare();
                    reproductor.start();
                    imgBoton.setVisibility(View.VISIBLE);
                    imgBoton.setImageResource(R.drawable.boton_pausar);
                    imgBotonStop.setVisibility(View.VISIBLE);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        imgBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reproductor.isPlaying()){
                    reproductor.pause();
                    imgBoton.setImageResource(R.drawable.boton_reproducir);
                    imgBotonStop.setVisibility(View.INVISIBLE);
                } else {
                    reproductor.start();
                    imgBoton.setImageResource(R.drawable.boton_pausar);
                    imgBotonStop.setVisibility(View.VISIBLE);
                }
            }
        });
        imgBotonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBoton.setImageResource(R.drawable.boton_reproducir);
                reproductor.seekTo(000);
                reproductor.pause();
                imgBotonStop.setVisibility(View.INVISIBLE);
            }
        });
    }
}