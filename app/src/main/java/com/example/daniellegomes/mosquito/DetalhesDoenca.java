package com.example.daniellegomes.mosquito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetalhesDoenca extends AppCompatActivity {


    private TextView mTextNome;
    private TextView mTextPeriodo;
    private TextView mTextCiclo;
    private TextView mTextQuant;

    private ClasseDoenca mClasseDoenca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Detalhes doenca","CREATE");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_doenca);

        mClasseDoenca = (ClasseDoenca) getIntent().getSerializableExtra("Doencas");

        mTextNome = (TextView) findViewById(R.id.txt_nomeDet);
        mTextPeriodo = (TextView) findViewById(R.id.txt_incubaDet);
        mTextCiclo = (TextView) findViewById(R.id.txt_cicloDet);
        mTextQuant = (TextView) findViewById(R.id.txt_quantDet);

        if (mClasseDoenca != null){

            Log.i("Detalhes doenca","Entrei");

            mTextNome.setText(mClasseDoenca.getNomeDoenca());
            mTextPeriodo.setText(Integer.toString(mClasseDoenca.getPeriodoIncubado()));
            mTextCiclo.setText(mClasseDoenca.getCiclo());
            mTextQuant.setText(Integer.toString(mClasseDoenca.getQuantSintomas()));

        }

    }
}
