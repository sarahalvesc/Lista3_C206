public class Pessoa {
    public String nome;
    public int cpf;
    public Endereco enderecos[];

    public void  Pessoa (String nome, int cpf, int qtdEnd){
        this.nome=nome;
        this.cpf=cpf;

    }
    public void addEndereco(Endereco end){

    }
    public void mostraInfo(){
        System.out.println("nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("enderecos: " + enderecos);

    }
}
