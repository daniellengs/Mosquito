package com.example.daniellegomes.mosquito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void ListaDoencas(View v) {

    Intent it = new Intent(this, DoencasActivity.class);
        startActivity(it);
    }

    public void Prevencao(View v) {

        Intent it = new Intent(this, PrevencaoActivity.class);
        startActivity(it);
    }

    public void LocaisRisco(View v) {

        Intent it = new Intent(this, LocaisActivity.class);
        startActivity(it);
    }


}
