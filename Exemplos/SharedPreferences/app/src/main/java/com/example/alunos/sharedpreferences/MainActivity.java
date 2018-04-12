package com.example.alunos.sharedpreferences;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.content.SharedPreferences;

class MainActivity extends AppCompatActivity {

    EditText valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = (EditText) findViewById(R.id.txtValor);
    }
    public void salvar(View v){
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        String oValor = valor.getText().toString();
        if(oValor.matches("")){
            Toast toast = Toast.makeText(MainActivity.this, "Digite algo...", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        SharedPreferences.Editor editor = arquivo.edit();
        editor.putString("valor", oValor);
        editor.commit();
    }

    public void carregar(View v){
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        String oValor = arquivo.getString("valor", "nada...");
        valor.setText(oValor);
        Log.i("oValor: ", oValor);
    }
}

