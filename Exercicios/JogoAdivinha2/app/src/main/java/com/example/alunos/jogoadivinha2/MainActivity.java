package com.example.alunos.jogoadivinha2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.*;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

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

    private int cont;
    private Random gerador = new Random();
    private int numero = gerador.nextInt(1000)+1;
    private TextView tentativas;

    public void Confere(View v) {

        EditText userInput = findViewById(R.id.editText);
        String str = userInput.getText().toString();
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);

        int num = Integer.parseInt(str);
        if (num == numero) {
            TextView etiqueta = (TextView) findViewById(R.id.etiqueta);
            etiqueta.setText(getResources().getString(R.string.lblHello));
            tentativas = (TextView) findViewById(R.id.tentativas);
            tentativas.setText(Integer.toString(cont));

            arquivo = getPreferences(Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = arquivo.edit();

            editor.putString("valor5",arquivo.getString("valor4","Nenhum..."));
            editor.putString("valor4",arquivo.getString("valor3","Nenhum..."));
            editor.putString("valor3",arquivo.getString("valor2","Nenhum..."));
            editor.putString("valor2",arquivo.getString("valor1","Nenhum..."));
            editor.putString("valor1",cont+"");
            editor.commit();
            Random gerador = new Random();
            this.numero = gerador.nextInt(1000)+1;

        } else {
            cont++;
            TextView etiqueta = (TextView) findViewById(R.id.etiqueta);
            etiqueta.setText(getResources().getString(R.string.lblHello2));
            TextView tentativas = (TextView) findViewById(R.id.tentativas);
            tentativas.setText(Integer.toString(cont));

            if (num > numero) {
                TextView palpite = (TextView) findViewById(R.id.palpite);
                palpite.setText("TENTE UM NÚMERO MENOR"+numero);
            } else {
                TextView palpite = (TextView) findViewById(R.id.palpite);
                palpite.setText("TENTE UM NÚMERO MAIOR");
            }
        }
    }

    public void placar(View v){
        Intent i = new Intent(MainActivity.this,Placar.class);
        Bundle bundle = new Bundle();

        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = arquivo.edit();

        bundle.putString("valor5",arquivo.getString("valor5","Nenhum..."));
        bundle.putString("valor4",arquivo.getString("valor4","Nenhum..."));
        bundle.putString("valor3",arquivo.getString("valor3","Nenhum..."));
        bundle.putString("valor2",arquivo.getString("valor2","Nenhum..."));
        bundle.putString("valor1",arquivo.getString("valor1","Nenhum..."));

        i.putExtras(bundle);

        startActivity(i);
    }

}
