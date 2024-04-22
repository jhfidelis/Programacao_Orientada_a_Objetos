/**
 * Classe criada para instanciar Threads e colocar em modo de concorrência
 * @author Henrique Fidelis
 * @since Classe criada em 07/12/2023
 */
public class Processo {
    public static void main(String[] args) {
        while(true) {
            Thread t1, t2, t3, t4;
            //Criando novas threads
            t1 = new Threads("Henrique");
            t2 = new Threads("A Fatec SDP precisa urgentemente de ar-condicionado");
            t3 = new Threads("Crefisa campeã de novo");
            t4 = new Threads("Santos Eterno na Série B");

            //Colocando as threads em estado de Pronto
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
        
    }//fim do main

}//fim da classe
