
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * 2 - Criar a classe ArCondicionado passando a temperatura inicial
 */

/**
 * Classe criada para implementar TODOS os métodos da interface Eletrodomésticos
 * @author Henrique Fidelis
 * @since Classe criada em 30/11/2023
 */
public class ArCondicionado implements Eletrodomestico{
    String marca;
    int temperatura;
    boolean ligado;
    
    //Método construtor da classe ArCondicionado
    public ArCondicionado(String marca, int temperatura, boolean ligado) {
        this.marca = marca;
        this.temperatura = temperatura;
        this.ligado = ligado;
    }
    
    @Override
    public void ligar() {
        this.ligado = true;
        try {
            System.out.println("O Ar-Condicionado foi ligado!"
                    + "\nTemperatura inicial: " + temperatura + "°C");
            /*JOptionPane.showMessageDialog(null, "O Ar-Condicionado foi ligado!"
            + "\nTemperatura inicial: " + temperatura + "°C");*/
            ajustarTemperatura();
        } catch (InterruptedException ex) {
            Logger.getLogger(ArCondicionado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ajustarTemperatura() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura desejada: ");        
        int novaTemp = input.nextInt();
        
        if(novaTemp == temperatura) {
            System.out.println("Temperatura ambiente está como desejado!");
        }
        else if (novaTemp > temperatura) {
            System.out.println("Aumentando a temperatura...");
            while(novaTemp > temperatura) {
                System.out.println(temperatura);
                Thread.sleep(1000);
                temperatura++;
            }
        }
        else {
            System.out.println("Diminuindo a temperatura...");
            do{
                System.out.println(temperatura);
                Thread.sleep(1000);
                temperatura--;
            }while(novaTemp < temperatura);
        }
        
        System.out.println("Temperatura ajustada para " +temperatura+ "°C");
        desligar();
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("O Ar-Condicionado foi desligado!");
    }

}//fim da classe
