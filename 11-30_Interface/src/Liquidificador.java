/**
 * Classe criada para implementar TODOS os métodos da interface Eletrodomésticos
 * @author Henrique Fidelis
 * @since Classe criada em 30/11/2023
 */
public class Liquidificador implements Eletrodomestico{

    String marca;
    boolean ligado;
    int capacidade;

    //Método construtor da classe Liquidificador
    public Liquidificador(String marca, boolean ligado, int capacidade) {
        this.marca = marca;
        this.ligado = ligado;
        this.capacidade = capacidade;
    }
    
    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("O liquidificador foi ligado!");
    }
    
    public void ligar(int velocidade){
        ligar();
        System.out.println("Foi ligado na velocidade " + velocidade);
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("O liquidificador foi desligado!");
    }

}//fim da classe
