package com.example.lw.intentimplicita;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirUrl(View v){
        EditText url = (EditText) findViewById(R.id.txtUrl);
        String aUrl = url.getText().toString();
        if(aUrl.matches("")){
            Toast toast = Toast.makeText(getApplicationContext(),"É necessário digitar um endereço web",Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        Intent intencao = new Intent(Intent.ACTION_VIEW, Uri.parse(aUrl.toLowerCase()));
        startActivity(intencao);
    }
}
