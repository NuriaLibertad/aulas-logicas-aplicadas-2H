public class Main {
    public static void main(String[] args) {
        //Aula introdutória de Orientação à Objetos
        //Declaração de objeto
        Pessoa adao;
        //Intsancia do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "lee";
        // comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));
        //Criar novos objetos
        //Declarar objeto
        Pessoa rainha;
        // Instanciar objetos
        rainha = new Pessoa();
//Definir forma do objeto
        rainha.nome = "Tinha";
        rainha.sobrenome = "Tunner";
        //Definição do comportamneto
        rainha.falar();
        rainha.comer();


    }

}








































