package com.example.daniellegomes.mosquito;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by daniellegomes on 03/08/17.
 */

public class DoencaAdapter extends BaseAdapter {

    Context mContext;
    List<ClasseDoenca> doencas;

    // Context é utilizado para carregar o arquivo de layout e as imagens
    // List, lista de objetos a serem exibidos
    public DoencaAdapter(Context mContext, List<ClasseDoenca> doencas)
    {
        this.mContext = mContext;
        this.doencas = doencas;
    }

    @Override
    public int getCount()
    {
        return doencas.size();
    }

    @Override
    public Object getItem(int position)
    {
        return doencas.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    // getView é o método mais importate, pois é nele que será gerada a View que representará cada item da lista.
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Passo 1 - obter o objeto doença a partir da lista de objeto usando a posição recebida no parâmetro
        ClasseDoenca doenca = doencas.get(position);

        // Passo 2 - Carregar o arquivo de layout
        ViewHolder holder = null;
        if(convertView == null) // View nova, temos que criá-la
        {
            Log.d("NGVL", "View Nova => position: " + position);
            convertView = LayoutInflater.from(mContext).inflate(R.layout.activity_doencas, parent, false);
            holder = new ViewHolder();
            holder.imgLogo = (ImageView) convertView.findViewById(R.id.imgLogo);
            holder.txtNome = (TextView) convertView.findViewById(R.id.txtName);
            holder.txtPeriodo = (TextView) convertView.findViewById(R.id.txtPeriodo);

            convertView.setTag(holder);

        }
        else { // View reutilizada, pegamos apenas a ViewHolder
            Log.d("NGVL", "View existente => position: " + position);
            holder = (ViewHolder)convertView.getTag();
        }

        // Passo 3 - Preenchemos os componentes visuais com os atributos do objeto doenca
        // 0 = zika vírus; 1 = febre amarela; 2 = dengue; 3 =  chikungunya
        Resources res = mContext.getResources();
        TypedArray logos = res.obtainTypedArray(R.array.logos);
        // Aqui pega a imagem específica de cada posição indicada pelo segundo argumento do método construtor que é tamanhaMosquito
        holder.imgLogo.setImageDrawable(logos.getDrawable(doenca.getTamanhoMosquito()));
        holder.txtNome.setText(doenca.getNomeDoenca());
        holder.txtPeriodo.setText(String.valueOf(doenca.getPeriodoIncubado()));

        // Passo 4 - retornamos o layout devidamente preenchido com as informações do objeto
        return convertView;
    }

    static class ViewHolder{
        ImageView imgLogo;
        TextView txtNome;
        TextView txtPeriodo;
    }

}
