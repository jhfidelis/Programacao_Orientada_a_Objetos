/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar os objetos das classes Carro, Caminhao e Onibus
 * @author Henrique Fidelis
 * @since Classe criada em 09/11/2023
 */
public class Loja {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagem", "Gol", 2015, 40000f, "EF2345678BC", 1.6f, 329);
        carro.exibirDadosCarro();
        
        Caminhao caminhao = new Caminhao("Mercedes-Bens", "Modelo A", 2019, 89999.90f, "Carreta", 4, 450.5f, true);
        caminhao.exibirDadosCaminhao();
        
        Onibus onibus = new Onibus("Mercedes-Bens", "Millenium IV", 2019, 149000.49f, "Bi-articulado", "Automático", 59, 398.7f, true);
        onibus.exibirDadosOnibus();
        
        System.out.println("\nSaída dos objetos com a aplicação de sobrescrita de métodos");
        carro.exibirDados();
        caminhao.exibirDados();
        onibus.exibirDados();
    }//fim do main
}//fim da classe
