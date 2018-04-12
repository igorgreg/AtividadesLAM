package com.example.alunos.jogoadivinha;

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
    }
    private int cont = 3;
    private Random gerador = new Random();
    private int numero = gerador.nextInt(10)+1;

    public void Confere(View v) {
        EditText userInput = findViewById(R.id.editText);
        String str = userInput.getText().toString();

        int num = Integer.parseInt(str);
        if (cont != 0) {
            if (num == numero) {
                TextView etiqueta = (TextView) findViewById(R.id.textView);
                etiqueta.setText(getResources().getString(R.string.lblHello));
                cont = 3;
            } else {
                cont--;
                TextView etiqueta = (TextView) findViewById(R.id.textView);
                etiqueta.setText(getResources().getString(R.string.lblHello2));
            }
        }else{
            TextView etiqueta = (TextView) findViewById(R.id.textView);
            etiqueta.setText(getResources().getString(R.string.lblHello3));
            cont = 3;
        }
        numero = gerador.nextInt(10)+1;
    }

}
