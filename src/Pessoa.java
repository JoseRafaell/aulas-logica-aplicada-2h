public class Pessoa {
    //Atributos da classe
    public String nome;
    public String sobrenome;
    //Metodos da classe
    public void falar(){
        System.out.println("Falei");
    }
    public String falar(String texto){
        return "texto";
    }
    public Pessoa criarPessoa(){
        return  new Pessoa();
    }
    public void comer(){
        System.out.println("pessoa comeu");
    }
}
