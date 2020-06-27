package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Pantalla1 extends AppCompatActivity {

    private EditText editTxtMonto;
    private RadioButton chekDolar, chekEuro, chekReal;
    private TextView editTxtResultado;
    private Button btnConvertir, btnReinicio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        editTxtMonto = findViewById(R.id.editTxtMonto);
        chekDolar = findViewById(R.id.chekDolar);
        chekEuro = findViewById(R.id.chekEuro);
        chekReal = findViewById(R.id.chekReal);
        editTxtResultado = findViewById(R.id.editTxtResultado);
        btnConvertir = findViewById(R.id.btnConvertir);
        btnReinicio = findViewById(R.id.btnReinicio);

        btnReinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReiniciarControles();
            }
        });

    }
    private void ReiniciarControles()
    {
        editTxtMonto.getText().clear();
        editTxtResultado.setText("Resultado");
        chekDolar.setChecked(true);



    }


}