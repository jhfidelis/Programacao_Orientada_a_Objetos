/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para...
 * @author Henrique Fidelis
 * @since Classe criada em 09/11/2023
 */
public class Caminhao extends Veiculo {
    String tipoCaminhao;
    int eixos;
    float capacTanque;
    boolean seguro;
    
    //Método construtor de Caminhao
    public Caminhao(String marca, String modelo, int ano, float valor, String tipoCaminhao, int eixos, float capacTanque, boolean seguro) {
        super(marca, modelo, ano, valor);
        this.tipoCaminhao = tipoCaminhao;
        this.eixos = eixos;
        this.capacTanque = capacTanque;
        this.seguro = seguro;
    }
    
    //Método para exibir os dados de um caminhão
    public void exibirDadosCaminhao() {
        super.exibirDadosVeiculo();
        System.out.println("Tipo de Caminhão: " + tipoCaminhao);
        System.out.println("Quantidade de eixos: " + eixos + " eixos");
        System.out.println("Capacidade do tanque de combustível: " + capacTanque + " litros");
        System.out.println("Possui seguro: " + (seguro?"Sim":"Não"));
        System.out.println("");
    }
    
    //Método sobrescrito da classe veículo
    @Override
    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de caminhão: " + tipoCaminhao);
        System.out.println("Quantidade de eixos: " + eixos + " eixos");
        System.out.println("");
    }
}//fim da classe
