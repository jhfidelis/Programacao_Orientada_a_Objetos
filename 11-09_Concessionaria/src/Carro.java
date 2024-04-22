/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para herdar atributos e métodos da superclasse Veiculo
 * @author Henrique Fidelis
 * @since Classe criada em 09/11/2023
 */
public class Carro extends Veiculo{
    String chassi;
    float potencia;
    int volPortaMalas;
    
    //Método construtor de carro
    public Carro(String marca, String modelo, int ano, float valor, String chassi, float potencia, int volPortaMalas) {
        super(marca, modelo, ano, valor);
        this.chassi = chassi;
        this.potencia = potencia;
        this.volPortaMalas = volPortaMalas;
    }
    
    //Método para exibir os dados de um carro
    public void exibirDadosCarro() {
        super.exibirDadosVeiculo();
        System.out.println("Chassi: " + chassi);
        System.out.println("Potência: " + potencia);
        System.out.println("Volume do porta-malas: " + volPortaMalas + " litros");
        System.out.println("");
    }
    
    //Método sobrescrito da classe veículo
    @Override
    public void exibirDados() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo: " + modelo + " " + ano);
        System.out.println("Potência: " + potencia);
        System.out.println("Volume do porta-malas: " + volPortaMalas + " litros");
        System.out.println("");
    }
    
}//fim da classe
