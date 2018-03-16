package com.example.lw.jg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int tentativas = 2;
    public int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random gerador = new Random();
        this.numero = gerador.nextInt(10)+1;
    }

    public void rodar(View v){
        TextView etiqueta = (TextView) findViewById(R.id.textView);
        TextView etiqueta2 = (TextView) findViewById(R.id.textView2);
        EditText userInput = findViewById(R.id.editText);
        etiqueta2.setText("Você ainda tem "+this.tentativas+" tentativas !!");
        if(this.tentativas == 0){
            etiqueta.setText(getResources().getString(R.string.acabou)+" "+this.numero);
        }else {
            this.tentativas = this.tentativas - 1;
            if (this.numero == Integer.parseInt(userInput.getText().toString())) {
                etiqueta.setText("Acertoooou");
            } else if (this.numero > Integer.parseInt(userInput.getText().toString())) {
                etiqueta.setText(getResources().getString(R.string.menor));
            } else {
                etiqueta.setText(getResources().getString(R.string.maior));
            }
        }
        //etiqueta.setText(getResources().getString(R.string.acabou)));
    }
}
