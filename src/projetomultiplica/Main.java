/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomultiplica;

/**
 *
 * @author Fernando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multiplica m = new Multiplica("Multiplicação 1", 5);
        m.setTempo(1000);
        

        Multiplica m2 = new Multiplica("Multiplicação 2", 10);
        m2.setTempo(500);
        m2.sair();
        
        /*SomaTres s3 = new SomaTres(400);
        s3.setValor1(10);
        s3.setValor2(20);
        s3.setV3(30);
        Thread st3 = new Thread(s3);
        st3.start();*/
        
        
        
    }
}