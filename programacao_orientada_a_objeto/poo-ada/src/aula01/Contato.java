package aula01;

public class Contato {

    private String nome;
    private String numero;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Contato() {
    }

    public Contato(String nome, String numero, String descricao) {
        this.nome = nome;
        this.numero = numero;
        this.descricao = descricao;
    }

    public void ligar() {
        System.out.printf("Ligando para %s ...%n", this.numero);
    }

    public void detalhar() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Numero: %s%n", numero);
        System.out.printf("Descricao: %s%n", descricao);
    }

}
