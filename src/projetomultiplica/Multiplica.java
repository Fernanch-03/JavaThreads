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
public class Multiplica extends Thread {
    private String nome;
    private int valorMultiplicar;
    private int tempo;
    private boolean parada;
    private boolean fim;
    
    public Multiplica(String nome, int valor) {
        this.nome = nome;
        this.valorMultiplicar = valor;
        this.parada = false;
        this.fim = false;
        start();
    }

    @Override
    public void run() {
        System.out.println("Nome: " + this.nome);

        for (int x = 0; x <= 10; x++) {
            System.out.println(this.valorMultiplicar + " x " + x + " = " + (this.valorMultiplicar * x));
            try {
                Multiplica.sleep(tempo);
                
                while(parada){
                    synchronized(this){
                        System.out.println("Parada aqui");
                        wait();
                    }
                }
                if(fim){
                    interrupt();
                    break;
                  }
                
                
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("Fim da Thread " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorMultiplicar() {
        return valorMultiplicar;
    }

    public void setValorMultiplicar(int valorMultiplicar) {
        this.valorMultiplicar = valorMultiplicar;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public synchronized void parar(){
        this.parada = true;
        notify();
    }
    public synchronized void voltar(){
        this.parada = false;
        notify();
    }
    public synchronized void sair(){
        this.fim = true;
        notify();
    }
    
}