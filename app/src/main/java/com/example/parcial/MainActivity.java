package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnIngresar;
    private EditText editTxtNombre, editTxtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.btnIngresar);
        editTxtNombre = findViewById(R.id.editTxtNombre);
        editTxtPass = findViewById(R.id.editTxtPass);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Usuario = editTxtNombre.getText().toString();
                String Pass = editTxtPass.getText().toString();

                if (Usuario.equals("ites") && Pass.equals("1234"))
                {
                    Toast.makeText(MainActivity.this, "Acceso Valido", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Acceso No Permitido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}