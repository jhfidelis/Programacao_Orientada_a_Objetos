
/**
 * Classe criada para instanciar objetos so tipo Pesso em memória
 * @author Henrique Fidelis
 * @since Classe criada em 26/10/2023
 */
public class Dados {
    public static void main(String[] args) {
        //Instanciando os objetos em memória
        /* Pessoa p1, p2, p3;
        p1 = new Pessoa("Rodrigo", 20, (float)1.83, 63.2f);
        p2 = new Pessoa("Maria", 25, 1.58f, 107); 
            /* Outra forma de criar uma instância
            int a, b, c;
            a = 8;
            b = 4;
            Pessoa px, py, pz
            px = new Pessoa("Rodrigo", 20, (float)1.83);
            py = new Pessoa("Maria", 25, 1.58f);

        Pessoa pessoa = new Pessoa("Ivo", 36, 1.74f, 34);
        //pessoa.exibirDadosPessoa();
        
        p3 = p1;
        //pessoa = p2; */
        
        //Mostrar os dados dos objetos que estão na memória
        //p1.exibirDadosPessoa();
        //p3.exibirDadosPessoa();
        //pessoa.exibirDadosPessoa();
        
        //p1.exibirDadosLinha();
        //pessoa.exibirDadosPessoa();
        
        //p1.classificarIMC();
        //p2.classificarIMC();
        //pessoa.classificarIMC();
        
        //p1.classificarIdade();
        //p2.classificarIdade();
        //pessoa.classificarIdade();
        
        //p1.exibirDadosLinha();
        //p2.exibirDadosLinha();
        //pessoa.exibirDadosLinha();
        
        Pessoa pessoa = new Pessoa();
        pessoa.exibirDadosPessoaGUI();
        
    }//fim do main
}//fim da classe
