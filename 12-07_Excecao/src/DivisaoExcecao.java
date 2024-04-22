/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para...
 * @author Henrique Fidelis
 * @since Classe criada em 07/12/2023
 */
public class DivisaoExcecao extends Exception {

    public DivisaoExcecao() {
        super("O valor de A não pode ser NEGATIVO");
    }

    public DivisaoExcecao(boolean b) {
        super("O valor de B não pode ser maior que 100");
    }
    
    public DivisaoExcecao(int x) {
        super("Os valores de A e B não podem ser iguais");
    }

}//fim da classe
