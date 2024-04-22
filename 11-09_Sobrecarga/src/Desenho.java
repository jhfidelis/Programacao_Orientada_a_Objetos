/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo figura exemplificando a sobrecarga de métodos
 * @author Henrique Fidelis
 * @since Classe criada em 09/11/2023
 */
public class Desenho {
    public static void main(String[] args) {
        Figura ponto = new Figura(500);
        Figura linha = new Figura(10, 65);
        Figura triangulo = new Figura(12, 66, 97);
        Figura retangulo = new Figura(06, 02, 20, 04);
       
        ponto.exibirFigura(1);
        linha.exibirFigura("www", 56);
        triangulo.exibirFigura("plu", 12, 12.5f);
        retangulo.exibirFigura("cabo", 27, 65.23f, true);
        
        Figura figura = new Figura(10, 20, 50);
        figura.exibirFigura();
    }
}//fim da classe
