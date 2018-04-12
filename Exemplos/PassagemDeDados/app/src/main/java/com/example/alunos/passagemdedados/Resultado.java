package com.example.alunos.passagemdedados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();

        String nome = pacote.getString("nome");
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(String.format("Olá, %s!", nome));
    }
}

