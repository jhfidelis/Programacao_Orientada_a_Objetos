/**
 * Classe criada para instanciar objetos concretos do tipo eletrodoméstico
 * @author Henrique Fidelis
 * @since Classe criada em 30/11/2023
 */
public class Loja {
    public static void main(String[] args) throws InterruptedException {
        Televisao tv = new Televisao("Samsung", 65, false);
        //tv.ligar();
        //tv.desligar();
        //tv.desligar(10);
        
        Liquidificador liqui = new Liquidificador("Philco", false, 2);
        //liqui.ligar();
        //liqui.ligar(3);
        //liqui.desligar();
        
        MicroOndas micro = new MicroOndas("Brastemp", false);
        //micro.ligar();
        //micro.ligar(30);
        //micro.fazerPipoca();
        //micro.desligar();
        
        ArCondicionado ar = new ArCondicionado("Samsung", 30, false);
        //ar.ligar();
        //ar.ajustarTemperatura();
        //ar.desligar();
        
        MaquinaDeLavar maq = new MaquinaDeLavar("Eletrolux", 15, false);
        //maq.ligar();
        //maq.avaliarCapacidade();
        //maq.desligar();
        
    }//fim do main
    
}//fim da classe
