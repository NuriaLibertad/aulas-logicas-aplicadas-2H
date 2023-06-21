public class Produto {
    private double  preco;
    //Atributos
    double setePreco;
    String modelo;

    //Seter
    public void setePreco(double _preco) {
        // if(nivelAcesso == 5)
        //this.preco = _preco;
        //}
    }
    //Método construtor
    Produto(){}
    //Sobrecarga do método construtor
    Produto(double preco){
        this.preco = preco;


    }
    // Mais uma sobrecarga
    Produto(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
        Produto p3;
        p3 = new Produto("Placa Vídeo", 1300.00);
        p3 = new Produto("Placa mãe", 2300.00);

    }
}
