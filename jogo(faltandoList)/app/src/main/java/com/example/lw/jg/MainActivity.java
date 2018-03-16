package com.example.lw.jg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int tentativas = 0;
    public int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random gerador = new Random();
        this.numero = gerador.nextInt(1000)+1;
    }

    public void rodar(View v){
        TextView etiqueta = (TextView) findViewById(R.id.textView);
        EditText userInput = findViewById(R.id.editText);
        if (this.numero == Integer.parseInt(userInput.getText().toString())) {
            etiqueta.setText("Acertoooou");
        } else if (this.numero > Integer.parseInt(userInput.getText().toString())) {
            etiqueta.setText(getResources().getString(R.string.menor)+this.numero);
        } else {
            etiqueta.setText(getResources().getString(R.string.maior));
        }
    }
}
