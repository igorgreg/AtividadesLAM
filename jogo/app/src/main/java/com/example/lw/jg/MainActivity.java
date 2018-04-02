package com.example.lw.jg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int tentativas = 1;
    public int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random gerador = new Random();
        this.numero = gerador.nextInt(1000)+1;
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = arquivo.edit();
        editor.putString("valor1","");
        editor.putString("valor2","");
        editor.putString("valor3","");
        editor.putString("valor4","");
        editor.putString("valor5","");
        editor.commit();

    }

    public void rodar(View v){
        TextView etiqueta = (TextView) findViewById(R.id.textView);
        TextView etiqueta2 = (TextView) findViewById(R.id.textView2);
        EditText userInput = findViewById(R.id.editText);
        etiqueta2.setText("Você ainda fez "+this.tentativas+" tentativas !!");
        this.tentativas +=1;
        if (this.numero == Integer.parseInt(userInput.getText().toString())) {
            etiqueta.setText("Acertoooou");
        } else if (this.numero > Integer.parseInt(userInput.getText().toString())) {
            etiqueta.setText(getResources().getString(R.string.menor)+numero);
        } else {
            etiqueta.setText(getResources().getString(R.string.maior));
        }
    }


    public void mostrarPlacar(View v){
        Intent i = new Intent(MainActivity.this,PlacarActivity.class);
        Bundle bundle = new Bundle();

        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = arquivo.edit();
        editor.putString("valor5",arquivo.getString("valor4","Nenhum..."));
        editor.putString("valor4",arquivo.getString("valor3","Nenhum..."));
        editor.putString("valor3",arquivo.getString("valor2","Nenhum..."));
        editor.putString("valor2",arquivo.getString("valor1","Nenhum..."));
        editor.putString("valor1",Integer.toString(tentativas));
        editor.commit();

        bundle.putString("valor5",arquivo.getString("valor5","Nenhum..."));
        bundle.putString("valor4",arquivo.getString("valor4","Nenhum..."));
        bundle.putString("valor3",arquivo.getString("valor3","Nenhum..."));
        bundle.putString("valor2",arquivo.getString("valor2","Nenhum..."));
        bundle.putString("valor1",arquivo.getString("valor1","Nenhum..."));

        i.putExtras(bundle);

        startActivity(i);
    }
}
