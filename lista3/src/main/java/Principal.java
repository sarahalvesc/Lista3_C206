public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.Pessoa("Marcos", 145486, 2);
        p1.addEndereco(p1.enderecos[1]);
        Endereco e1 = new Endereco();
        e1.Endereco("jose vivela neto", "sao benedito", 60);
        Endereco e2 = new Endereco();
        e2.Endereco("antonia assis longinho", "ozorio machado", 60);

        Endereco[] enderecos = new Endereco[1];
        enderecos[0]=e1;
        enderecos[1]=e2;

        p1.mostraInfo();

    }

}
