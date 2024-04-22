
import java.util.Scanner;

/*
 * 3 - Criar uma classe de eletrodomésticos à sua escolha
 */

/**
 * Classe criada para implementar TODOS os métodos da interface Eletrodomésticos
 * @author Henrique Fidelis
 * @since Classe criada em 08/12/2023
 */
public class MaquinaDeLavar implements Eletrodomestico{
    String marca;
    int capacidade;
    boolean ligado;
    
    public MaquinaDeLavar(String marca, int capacidade, boolean ligado) {
        this.marca = marca;
        this.capacidade = capacidade;
        this.ligado = ligado;
    }
    
    @Override
    public void ligar() {
        if(avaliarCapacidade() == true) {
            this.ligado = true;
            System.out.println("A máquina de lavar foi ligada!");
        }else {
            System.out.println("Não foi possível ligar a máquina");
        }
        //this.ligado = avaliarCapacidade();
    }
    
    public boolean avaliarCapacidade() {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de roupas a ser lavada (em kg): ");
        int peso = in.nextInt();
        if(peso > capacidade) {
            System.out.println("A máquina não suporta a quantidade desejada de roupa");
            return false;
        } else {
            System.out.println("Quantidade de roupas suportada pela máquina");
            return true;
        }
    }
    
    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("A máquina de lavar foi desligada!");
    }
}//fim da classe
