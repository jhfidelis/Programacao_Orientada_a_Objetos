/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo conta
 * @author Henrique Fidelis
 * @since Classe criada em 23/11/2023
 */
public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta("Joelmir", 223344, 500f, 1234);
        conta.exibirDadosConta();
        //conta.bloquearConta();
        //conta.exibirDadosConta();
        Menu menu = new Menu();
        
    }//fim do main

}//fim da classe
