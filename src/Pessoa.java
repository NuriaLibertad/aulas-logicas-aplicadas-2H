public class Pessoa extends Animal {
     //atributos da classe

     public String sobrenome;
    //métodos da classe
    public void falar(){
    System.out.println("falei");

 }
   public String falar(String texto){
        return texto;
}


    //sobrescrita do método
    public void comer(){
        System.out.println("pessoa comeu");
    }

}
