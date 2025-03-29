public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao){
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes(){
        System.out.println("----------------- INFO NINJA -----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Missão: " + this.missao);
        System.out.println("Nivel da missão: " + this.nivelDificuldade);
        System.out.println("Status da missão: " + this.statusMissao);
        System.out.println("----------------------------------------------");
    }
}
