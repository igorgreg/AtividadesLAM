package com.example.alunos.jogoadivinha2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

class Placar extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placar);

        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();


        TextView txQuinta = (TextView) findViewById(R.id.txQuinta);
        txQuinta.setText(pacote.getString("valor5"));

        TextView txQuarta = (TextView) findViewById(R.id.txQuarta);
        txQuarta.setText(pacote.getString("valor4"));

        TextView txTerca = (TextView) findViewById(R.id.txTerca);
        txTerca.setText(pacote.getString("valor3"));

        TextView txSegunda = (TextView) findViewById(R.id.txSegunda);
        txSegunda.setText(pacote.getString("valor2"));

        TextView txPrimeira = (TextView) findViewById(R.id.txPrimeira);
        txPrimeira.setText(pacote.getString("valor1"));

    }
    public void voltar(View v){

        this.finish();
    }
}
