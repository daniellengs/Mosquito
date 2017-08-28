package com.example.daniellegomes.mosquito;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.view.Gravity;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AutoCompleteTextView;
import android.os.AsyncTask;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DoencasActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    List<ClasseDoenca> doencas;
    DoencaAdapter doencasAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);


        doencas = new ArrayList<ClasseDoenca>();
        doencas.add(new ClasseDoenca("zika vírus",0, 3, "grande", 4));
        doencas.add(new ClasseDoenca("febre amarela", 0, 2, "medio", 5));
        doencas.add(new ClasseDoenca("dengue",0, 3, "grande", 3));
        doencas.add(new ClasseDoenca("chikungunya", 0, 2, "médio", 6));

        doencasAdapter = new DoencaAdapter(this, doencas);
        listView.setAdapter(doencasAdapter);

        listView.setOnItemClickListener(this);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
//        {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
     // O primeiro parâmetro é a listView que disparou o evento, o segundo é a View que foi clicada, o terceiro é o índice da linha que foi clicada

        ClasseDoenca doenca = (ClasseDoenca) parent.getItemAtPosition(position);
        Toast.makeText(DoencasActivity.this, doenca.getPeriodoIncubado() + "-" + doenca.getQuantSintomas(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(DoencasActivity.this, DetalhesDoenca.class);
        intent.putExtra("Doencas", doenca);
        startActivity(intent);

    }
}
