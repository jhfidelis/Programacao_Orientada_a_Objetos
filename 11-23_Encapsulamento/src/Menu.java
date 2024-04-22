
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para apresentar um menu de opções aos clientes
 * @author Henrique Fidelis
 * @since Classe criada em 23/11/2023
 */
public class Menu {
    //Conta conta;
    int opcao;
    
    public Menu() {
        Conta conta = new Conta("Joelmir", 223344, 500f, 1234);
        int opcao;
        String msg;
        msg = "1 - Depósito\n"
                + "2 - Saque\n"
                + "3 - Saldo\n"
                + "4 - Troca de senha\n"
                + "5 - Sair";
        while(true) {
            opcao = 0;
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Banco XPTO", -1));

            switch(opcao) {
                case 1: conta.realizarDeposito();
                        break;
                case 2: conta.realizarSaque();
                        break;
                case 3: conta.consultarSaldo();
                        break;
                case 4: conta.alterarSenha();
                        break;
                case 5: System.exit(0);
                        break;
                default: JOptionPane.showMessageDialog(null, "Opção incorreta");
            }//fim do switch
        }
    }//fim do construtor
}//fim da classe
