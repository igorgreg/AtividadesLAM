package com.example.lw.applista;

import android.app.Activity;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lw on 16/03/18.
 */

public class CursoAdapter extends BaseAdapter {
    List<Curso> lista;
    Activity atividade;

    public View getView(int position, View convertView, ViewGroup parent){
        View v = atividade.getLayoutInflater().inflate(R.layout.layout_linha, parent, false);
        Curso curso = lista.get(position);

        TextView nome = (TextView)
                v.findViewById(R.id.lblNomeCurso);
        TextView descricao = (TextView)
                v.findViewById(R.id.lblDescCurso);
        ImageView imagem = (ImageView)
                v.findViewById(R.id.imgCurso);
        nome.setText(curso.getNome());
        descricao.setText(curso.getDescricao());
        imagem.setImageResource(curso.getImageId());

        return v;
    }

    public CursoAdapter(List<Curso> aLista,Activity aAtividade){
        this.lista = aLista;
        this.atividade = aAtividade;
    }

    public int getCount(){
        return lista.size();
    }
    public Object getItem(int position){
        return lista.get(position);
    }
    public long getItemId(int position){
        return 0;
    }
}
