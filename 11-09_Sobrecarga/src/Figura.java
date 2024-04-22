/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para gerar objetos do tipo figura exercitando o conceito da sobrecarga de métodos
 * @author Henrique Fidelis
 * @since Classe criada em 09/11/2023
 */
public class Figura {
    Integer a, b, c, d;
    
    //Construtor de um ponto
    public Figura(int a) {
        this.a = a;
    }
    
    //Construtor para uma linha
    public Figura(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    //Construtor para um triângulo
    public Figura(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Construtor para um triângulo
    public Figura(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    /*A diferença dos parâmetros para sobrecarga de métodos (métodos com o mesmo nome) se dá pelo tipo, quantidade e ordem dos parâmetros*/
    //Método para exibir os dados de um ponto
    public void exibirFigura(int x) {
        System.out.println("Valor do ponto: " + a);
    }
    
    //Método para exibir os dados de uma linha
    public void exibirFigura(String t, int r) {
        System.out.println("Linha de valores " + a + " e " + b);
    }
    
    //Método para exibir os dados de um triângulo
    public void exibirFigura(String p, int l, float u) {
        System.out.println("Triângulo de valores " + a + ", " + b + " e " + c);
    }
    
    //Método para exibir os dados de um retângulo
    public void exibirFigura(String v, int w, float x, boolean y) {
        System.out.println("Retângulo de valores " + a + ", " + b + ", " + c + " e " + d);
    }
    
    //Método para identificar automaticamente qual o tipo de figura gerada
    public void exibirFigura() {
        if(a != null && b == null && c == null && d == null)
            exibirFigura(1);
        else if (a != null && b != null && c == null && d == null)
            exibirFigura("www", 15);
        else if (a != null && b != null & c != null && d == null)
            exibirFigura("xpto", 15, 5.5f);
        else
            exibirFigura("xpto", 15, 5.5f, true);
    }
}//fim da classe
