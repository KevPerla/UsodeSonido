package com.example.numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup lenguajeRG;
    private Button Aceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lenguajeRG = findViewById(R.id.RadioGroupLenguaje);
        Aceptar = findViewById(R.id.btnAceptar);

        Aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = lenguajeRG.getCheckedRadioButtonId();
                RadioButton radioButton =findViewById(selectedId);
                String lenguaje = radioButton.getText().toString();

                if(lenguaje.equals("Números español")) {
                    Intent intent = new Intent(MainActivity.this, numeros_espanol.class);
                    startActivity(intent);
                } else if (lenguaje.equals("Números inglés")) {
                    Intent intent = new Intent(MainActivity.this, Numeros_ingles.class);
                    startActivity(intent);
                }
            }
        });
    }
}