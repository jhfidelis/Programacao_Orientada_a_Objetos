
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para demonstrar o tratamento de exceção com as clásulas try... catch... throws
 * @author Henrique Fidelis
 * @since Classe criada em 07/12/2023
 */
public class Divisao {
    public static void main(String[] args) {
        int a, b, resultado;
        try{
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
            resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);
        }catch(ArithmeticException erro) {
            System.out.println("Não é possível divisão por ZERO");
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite somente números");
        }catch(DivisaoExcecao e){
            //JOptionPane.showMessageDialog(null, );
            System.out.println("Ocorreu um exceção do tipo: " + e.toString());
        }catch(Exception erro){
            System.out.println("Ocorreu um exceção do tipo: " + erro.toString());
        } 
        
    }//fim do main

    public static int dividir(int a, int b) throws DivisaoExcecao {
        if (a < 0)
            throw new DivisaoExcecao();
        if (b > 100)
            throw new DivisaoExcecao(true);
        if (a == b)
            throw new DivisaoExcecao(500);
        return a / b;
    }
}//fim da classe
