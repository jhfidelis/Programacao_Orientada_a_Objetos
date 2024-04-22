/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para gerar um objeto do tipo veículo
 * @author Henrique Fidelis
 * @since Classe criada em 09/11/2023
 */
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    float valor;
    
    //Método construtor da clase
    public Veiculo(String marca, String modelo, int ano, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }
    
    //Método para exibir os dados de um veículo
    public void exibirDadosVeiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
    }
    
    //Método para exemplificar a sobrescrita de métodos
    public void exibirDados() {
        System.out.println("É um veículo do modelo " + modelo);
    }
    
}//fim da classe
