/**
 * Classe criada para implementar os métodos da interface Eletrodomestico
 * @author Henrique Fidelis
 * @since Classe criada em 30/11/2023
 */
public class Televisao implements Eletrodomestico{

    String marca;
    int polegada;
    boolean ligada;

    //Método construtor da classe
    public Televisao(String marca, int polegada, boolean ligada) {
        this.marca = marca;
        this.polegada = polegada;
        this.ligada = ligada;
    }
    
    @Override
    public void ligar() {
        this.ligada = true;
        System.out.println("A Televisão foi ligada!");
    }

    @Override
    public void desligar() {
        this.ligada = false;
        System.out.println("A Televisão foi desligada!");
    }
    
    public void desligar(int timer) throws InterruptedException{
        System.out.println("Soneca de " + timer + " minutos");
        while (timer > 0) {
            Thread.sleep(1000);
            timer--;
        }
        desligar();
    }

}//fim da classe
