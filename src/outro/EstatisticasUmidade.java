/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outro;

import java.util.ArrayList;

public class EstatisticasUmidade {
    private ArrayList<Double> lstUmidade;

    public EstatisticasUmidade(){
        lstUmidade = new ArrayList<Double>();
    }

    public void setValor(double umidade){
        lstUmidade.add(umidade);
    }
    public double media(int amostra){
        double soma = 0.0;
        for (int i = 0; i < amostra; i++) {
            soma = soma + lstUmidade.get(i);
        }
        return soma/amostra;
    }

    public double desvioPadrao(int amostra){
        double media = media(amostra);
        double st = 0.0;
        for (int i = 0; i < amostra; i++) {
            st = st + Math.pow(lstUmidade.get(i) - media, 2);
        }
        return Math.sqrt(st/amostra);
    }

}