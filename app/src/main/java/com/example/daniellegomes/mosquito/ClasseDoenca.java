package com.example.daniellegomes.mosquito;

import java.io.Serializable;

/**
 * Created by daniellegomes on 03/08/17.
 */

public class ClasseDoenca implements Serializable{

    private String nomeDoenca;
    private int tamanhoMosquito;
    private int periodoIncubado;
    private String ciclo;
    private int quantSintomas;


   public ClasseDoenca(String nomeDoenca, int tamanhoMosquito, int periodoIncubado, String ciclo, int quantSintomas)
   {
       this.nomeDoenca = nomeDoenca;
       this.tamanhoMosquito = tamanhoMosquito;
       this.periodoIncubado = periodoIncubado;
       this.ciclo = ciclo;
       this.quantSintomas = quantSintomas;
   }

    public String getNomeDoenca() {
        return nomeDoenca;
    }

    public void setNomeDoenca(String nomeDoenca) {
        this.nomeDoenca = nomeDoenca;
    }

    public int getTamanhoMosquito() {
        return tamanhoMosquito;
    }

    public void setTamanhoMosquito(int tamanhoMosquito) {
        this.tamanhoMosquito = tamanhoMosquito;
    }

    public int getPeriodoIncubado() {
        return periodoIncubado;
    }

    public void setPeriodoIncubado(int periodoIncubado) {
        this.periodoIncubado = periodoIncubado;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getQuantSintomas() {
        return quantSintomas;
    }

    public void setQuantSintomas(int quantSintomas) {
        this.quantSintomas = quantSintomas;
    }
}
