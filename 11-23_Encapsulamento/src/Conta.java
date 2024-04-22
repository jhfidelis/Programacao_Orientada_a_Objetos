
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para demonstrar o princípio do encapsulamento
 * @author Henrique Fidelis
 * @since Classe criada em 23/11/2023
 */
public class Conta {
    String nome;
    int numConta;
    private float saldo;
    int senha;

    //Método construtor do objeto em memória
    public Conta(String nome, int numConta, float saldo, int senha) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    //Métrodos acessores
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    //Método para exibir os dados da conta corrente do cliente
    public void exibirDadosConta() {
        System.out.println("Cliente: " + getNome());
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Senha: " + getSenha());
        System.out.println("");
    }
    
    //Método para realizar saques na conta do cliente
    public void realizarSaque() {
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha:"));
        
        if(pwd == getSenha()){
            float vlrSaque = 0;
            vlrSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor do Saque:"));
            setSaldo(getSaldo() - vlrSaque);
        }
        else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
    
    //Método para alterar o saldo da conta do cliente
    public void alterarSaldo(float novoSaldo) {
        this.saldo = novoSaldo;
    }
    
    /*EXERCÍCIOS*/
    // Ex1 - Criar um método para realizar depósito na conta do cliente.
    //Método para realizar depósitos na conta do cliente
    public void realizarDeposito() {
        int nConta = 0;
        nConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta para depósito:"));
        
        if(nConta == getNumConta()) {
            float vlrDeposito = 0;
            vlrDeposito = Float.parseFloat(JOptionPane.showInputDialog("Valor do depósito:"));
            setSaldo(getSaldo() + vlrDeposito);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        }
        else
            JOptionPane.showMessageDialog(null, "Número da conta incorreta!");
    }
    
    //Ex2 - Alterar o método de saque para verificar se o cliente tem saldo na conta.
    //Método para realizar saque verificando se há saldo disponível na conta
    public void realizarSaqueChecagem() {
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha:"));
        
        if(pwd == getSenha()){
            float vlrSaque = 0;
            vlrSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor do Saque:"));
            if(getSaldo() >= vlrSaque){
                setSaldo(getSaldo() - vlrSaque);
            }
            else
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
    
    //Ex3 - Escrever um método para troca de senha.
    //Método para para alterar senha do cliente
    public void alterarSenha() {
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha:"));
        
        if(pwd == getSenha()){
            int novaSenha = 0;
            novaSenha = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova senha:"));
            setSenha(novaSenha);
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
    
    //Ex4 - Bloquear a senha do cliente após 3 tentativas erradas (Saque e troca de senha).
    //Método para alterar a senha do cliente após 3 tentativas erradas
    public boolean bloquearConta() {
        int i = 0; //contador
        int pwd = 0;
        
        while(i < 3) {
            pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha:"));
            if (pwd == getSenha()) {
                JOptionPane.showMessageDialog(null, "Senha correta");
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha incorreta");
                i++;
            }
        }
        
        if(i == 3)
            JOptionPane.showMessageDialog(null, "Conta bloqueada. Entrar em contato com seu gerente.");
        return false;
    }
    
    //Método para exibir o saldo da conta do cliente
    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo do cliente: R$" + getSaldo(), "Saldo disponível na conta", -1);
    }
}//fim da classe
