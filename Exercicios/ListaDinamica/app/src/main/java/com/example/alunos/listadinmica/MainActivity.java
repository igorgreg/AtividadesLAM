package com.example.alunos.listadinmica;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alunos.listadinmica.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pessoa> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void mostrarLista(View v){
        Intent it = new Intent(this, mostrarListaDinamica.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("contatos", lista);
        it.putExtras(bundle);
        startActivity(it);
    }

    public void salvarDados(View v){
        TextView info = (TextView) findViewById(R.id.textViewInfo);
        EditText Nome = (EditText) findViewById(R.id.editTextNome);
        EditText Telefone = (EditText) findViewById(R.id.editTextTelefone);
        lista.add(new Pessoa(Nome.getText().toString(), Telefone.getText().toString(), R.mipmap.ic_launcher_round));
        Nome.setText("");
        Telefone.setText("");
        info.setText("Salvou com sucesso");

    }
}
