package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pantalla3 extends AppCompatActivity {

    private Button btnSumar, btnResta, btnZoomMas, btnOcultar, btnZoomMenos, btnReset;
    private TextView txtResul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        btnSumar = findViewById(R.id.btnSumar);
        btnResta = findViewById(R.id.btnResta);
        btnZoomMas = findViewById(R.id.btnZoomMas);
        btnOcultar = findViewById(R.id.btnOcultar);
        btnZoomMenos = findViewById(R.id.btnZoomMenos);
        txtResul = findViewById(R.id.txtResul);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReiniciarControles();
            }
        });


    }

    private void ReiniciarControles()
    {

        txtResul.setText("0");




    }
}