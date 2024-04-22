/*
 * 1 - criar a classe microondas implementando todos os metodos da interface
 */

/**
 * Classe criada para implementar TODOS os métodos da interface Eletrodomésticos
 * @author Henrique Fidelis
 * @since Classe criada em 30/11/2023
 */
public class MicroOndas implements Eletrodomestico{
    String marca;
    boolean ligado;

    public MicroOndas(String marca, boolean ligado) {
        this.marca = marca;
        this.ligado = ligado;
    }
    
    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("O Micro-ondas foi ligado");
    }

    public void ligar(int tempo) throws InterruptedException {
        System.out.println("Micro-ondas ligado por " + tempo + " segundos");
        while (tempo > 0){
            System.out.println(tempo);
            Thread.sleep(1000);
            tempo--;
        }
        desligar();
    }
    
    public void fazerPipoca() throws InterruptedException{
        int tempo = 45;
        while (tempo > 0){
            System.out.println(tempo);
            Thread.sleep(1000);
            tempo--;
        }
        desligar();
    }
    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("O micro-ondas foi desligado");
    }

}//fim da classe
