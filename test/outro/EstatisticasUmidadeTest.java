/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outro;

import org.junit.Test;
import static org.junit.Assert.*;


public class EstatisticasUmidadeTest {
    
    public EstatisticasUmidadeTest() {
    }
    
    @Test
    public void testeMedia(){
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        double result = e.media(5);
        assertEquals("ERRO! calculo de todas as amostras",4.071,result,0.01);
        
    }
    
    @Test
    public void testeSetValor(){
        
    }
    
    @Test
    public void testeDesvioPadrao(){
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        double result = e.desvioPadrao(5);
        assertEquals("Erro calculo incorreto",2.80622,result,0.01);
       
    }
    public void  testeDesvioPadrao2(){
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        double result = e.desvioPadrao(1);
        assertEquals("Erro calculo incorreto",0,result,0.01);
       
    }
}
