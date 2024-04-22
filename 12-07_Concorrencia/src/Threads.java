
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para demosntrar a utilização de threads em programas que necessite concorrência e paraleleismo entre processos.
 * @author Henrique Fidelis
 * @since Classe criada em 07/12/2023
 */
public class Threads extends Thread{
    int sleepTime;
    
    //Método construtor de novas Threads
    public Threads(String nome) {
        super(nome);
        sleepTime = (int)(Math.random() * 5000);
        System.out.println("A thread " + super.getName() + " irá dormir por " + sleepTime + "ms...");
    }
    
    //Método que executa a thread
    public void run() {
        try {
            System.out.println("A Thread " + getName() + " foi dormir...");
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            System.out.println("A Thread foi interrompida");
        }
        System.err.println("A Thread " + getName() + " =====> ACORDOU!!!");
    }

}//fim da classe
