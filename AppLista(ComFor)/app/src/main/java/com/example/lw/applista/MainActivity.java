package com.example.lw.applista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Curso> curso = listaTodosOsCursos();
        ListView listaDeCursos = (ListView) findViewById(R.id.listView);
        CursoAdapter adapter = new CursoAdapter(curso, this);
        listaDeCursos.setAdapter(adapter);
    }

    private ArrayList<Curso> listaTodosOsCursos(){
        ArrayList<Curso> cursos = new ArrayList<>();

        String[] nomes = {"igor","julia","melissa","rayane"};
        String[] descricoes = {"gregs","falsa","iphone","jujuba"};

        for(int i = 0; i < nomes.length;i++){
            Curso algum = new Curso();
            algum.setNome(nomes[i]);
            algum.setDescricao(descricoes[i]);
            algum.setImageId(R.mipmap.ic_launcher);
            cursos.add(algum);
        };



        return cursos;
    }
}
