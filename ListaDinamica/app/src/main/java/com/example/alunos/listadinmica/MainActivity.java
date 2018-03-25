package com.example.alunos.listadinmica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.alunos.listadinmica.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pessoa> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista.add(new Pessoa("Maria de Oliveira", "99323-1234", R.mipmap.ic_launcher_round));
        lista.add(new Pessoa("Pedro da Silva", "3690-1234", R.mipmap.ic_launcher_round));
        lista.add(new Pessoa("Joao de Souza", "3690-4321", R.mipmap.ic_launcher_round));
    }

    public  void mostrarLista(View v){
        Intent it = new Intent(this, mostrarListaDinamica.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("contatos", lista);
        it.putExtras(bundle);
        startActivity(it);
    }
}
