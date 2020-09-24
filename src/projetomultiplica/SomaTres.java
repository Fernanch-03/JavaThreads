/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomultiplica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class SomaTres extends SomaDois implements Runnable{
    private int v3;
    private int tempo;
    
    public SomaTres(int tempo){
        this.tempo = tempo;
    }
    
    @Override
    public int somar(){
        return this.getValor1() + this.getValor2() + this.v3;
    }
    
    public void run(){
        for(int x = 0;x <=10; x++){
            System.out.println("Rodada "+x+" Valor da soma: "+somar());
            
            try {
                Thread.sleep(this.tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(SomaTres.class.getName()).log(Level.SEVERE, null, ex);
            }
 }
    }
    
    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }
    
    
}
