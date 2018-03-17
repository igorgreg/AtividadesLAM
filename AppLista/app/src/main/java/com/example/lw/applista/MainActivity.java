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

        Curso Informatica = new Curso();
        Informatica.setNome("Informatica");
        Informatica.setDescricao("Mt android");
        Informatica.setImageId(R.mipmap.ic_launcher);
        cursos.add(Informatica);

        Curso Mecatronica = new Curso();
        Mecatronica.setNome("Mecatronica");
        Mecatronica.setDescricao("Mt circuito");
        Mecatronica.setImageId(R.mipmap.ic_launcher);
        cursos.add(Mecatronica);

        Curso Edificacoes = new Curso();
        Edificacoes.setNome("Edificacoes");
        Edificacoes.setDescricao("Mt cimento");
        Edificacoes.setImageId(R.mipmap.ic_launcher);
        cursos.add(Edificacoes);


        return cursos;
    }
}
