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
public class Onibus extends Veiculo{
    String tipoOnibus;
    String tipoCambio;
    int qtdPassageiros;
    float capacTanque;
    boolean acessCadeirante;
    
    //Método construtor de Onibus
    public Onibus(String marca, String modelo, int ano, float valor, String tipoOnibus, String tipoCambio, int qtdPassageiros, float capacTanque, boolean acessCadeirante) {
        super(marca, modelo, ano, valor);
        this.tipoOnibus = tipoOnibus;
        this.tipoCambio = tipoCambio;
        this.qtdPassageiros = qtdPassageiros;
        this.capacTanque = capacTanque;
        this.acessCadeirante = acessCadeirante;
    }
    
    public void exibirDadosOnibus() {
        super.exibirDadosVeiculo();
        System.out.println("Tipo de ônibus: " + tipoOnibus);
        System.out.println("Tipo de Câmbio: " + tipoCambio);
        System.out.println("Quantidade de passageiros: " + qtdPassageiros + " passageiros");
        System.out.println("Capacidade do tanque de combustível: " + capacTanque + " Litros");
        System.out.println("Acessibilidade para cadeirantes: " +(acessCadeirante?"Sim":"Não"));
        System.out.println(" ");
    }
    
    //Método sobrescrito da classe veículo
    @Override
    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de ônibus: " + tipoOnibus);
        System.out.println("Acessibilidade para cadeirantes: " +(acessCadeirante?"Sim":"Não"));
        System.out.println("");
    }
}//fim da classe
