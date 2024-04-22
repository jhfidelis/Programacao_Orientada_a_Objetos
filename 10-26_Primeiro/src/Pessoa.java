
import javax.swing.JOptionPane;

/**
 * Classe criada para gerar objetos do tipo pessoa
 * @author Henrique Fidelis
 * @since Classe criada em 26/10/2023
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;
    float peso;
    //Nome, idade e altura são ATRIBUTOS
    /*
    //Método construtor do objeto em memória (objetivo de construir um objeto na memória)
    public Pessoa(String nome, int idade, float altura, float peso) { //n, i e a são variáveis
        //O método construtor tem q obrigatoriamente ter o mesmo nome da classe, o restante deve ser no infinitivo
        this.nome = nome; //se usa o 'this' para pegar o atributo e passar para o método construtor
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    */

    //Método construtor com entrada de dados por meio de GUI - Ghaphical User Interfsce
    public Pessoa() {
        //JOptionPane.showInputDialog(1, 2, 3, 4);
        //1 = null/this
        //2 = Texto dentro da caixa de dialogo
        //3 = Título da caixa de diálogo
        //4 = Ícone(-1 à 3)
        this.nome = JOptionPane.showInputDialog(null, "Nome: ", "Nome da pessoa", -1);
        this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: ", "Idade da pessoa", 0));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Altura: ", "Altura da pessoa", 1));
        this.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Peso: ", "Peso da pessoa", 2));

    }
    
    //Método comum para incluir os dados de uma pessoa
    public void exibirDadosPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    
    //Método para mostrar os dados de pessoas em uma única linha
    public void exibirDadosLinha() {
        System.out.println(nome + " tem " + idade + " anos, " + altura + "m de altura e pesa " + peso + "Kg");
        System.out.println("Pela idade, é conseiderado " + classificarIdadeRetorno());
        System.out.println("Seu IMC é: " + calcularIMC());
        System.out.println("Classificação do IMC: " + classificarIMC());
    }
    
    //Metodo para calcular o IMC de uma pessoa
    public float calcularIMC() {
        return peso / (altura * altura);
    }
    
    //Método para classificar o IMC de uma pessoa
    public String classificarIMC() {
        float imc;
        //exibirDadosLinha();
        imc = calcularIMC();
        
        if(imc < 16)
            return "Magreza grave";
        else if (imc < 17)
            return "Magreza moderada";
        else if (imc < 18.5)
            return "Magreza leve";
        else if (imc < 25)
            return "Saudável";
        else if (imc < 30)
            return "Sobrepeso";
        else if (imc < 35)
            return "Obesidade grau I";
        else if (imc < 40)
            return "Obesidade Grau II(Severa)";
        else
            return "Obesidade Grau III (Mórbida)";
    }
    
    //Método para clasificar idade de uma pessoa
    public void classificarIdade() {
        exibirDadosLinha();

        if(idade < 3)
            System.out.println("Bebê");
        else if(idade < 9)
            System.out.println("Criança");
        else if(idade < 13)
            System.out.println("Pré-Adolescente");
        else if(idade < 19)
            System.out.println("Adolescente");
        else if(idade < 24)
            System.out.println("Jovem");
        else if(idade < 59)
            System.out.println("Adulto");
        else
            System.out.println("Idoso");
    }
    
    //Método para classificar idade de uma pessoa com retorno em string
    public String classificarIdadeRetorno() {       
        if(idade < 3)
            return "Bebê";
        else if(idade < 9)
            return "Criança";
        else if(idade < 13)
            return "Pré-Adolescente";
        else if(idade < 19)
            return "Adolescente";
        else if(idade < 24)
            return "Jovem";
        else if(idade < 59)
            return "Adulto";
        else
            return "Idoso";
    }
    
    //Método para exibir os dados dentro de uma Ghaphical User Interfsce
    public void exibirDadosPessoaGUI(){
        String msg;
        msg = "Nome: " + nome +
              "\nIdade: " + idade +
              "\nAltura: " + altura +
              "\nPeso: " + peso + 
              "\nIMC: " + classificarIMC() +
              "\nClassificação da idade: " + classificarIdadeRetorno();
        JOptionPane.showMessageDialog(null, msg, "Dados de Pessoa", 3);
    }
}//fim da classe
