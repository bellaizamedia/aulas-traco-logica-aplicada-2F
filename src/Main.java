public class Main {
    public static void main(String[] args) {

        // aula de orientaçao a objeto
        // declarar objetos
        Pessoa adao;

        // instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();

        // definiçao de formato
        adao.nome = "adao";
        adao.sobrenome ="silva";
        eva.nome = "eva";
        eva.sobrenome = "silva";

        // acionar comportamento
        adao.falar();
        eva.falar();

        // criar mais objetos
        Pessoa qualquer = new Pessoa();

        // declarar objeto
        Pessoa rainha;
        // instanciação do objeto
        rainha = new Pessoa();
        // definindo forma da pessoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // definição de
        System.out.println(rainha.falar("alto"));
        rainha.comer();
    }
}