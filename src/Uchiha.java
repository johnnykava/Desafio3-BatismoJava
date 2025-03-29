public class Uchiha extends Ninja{
    String habilidadeEspecial = "Sharingan";

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("----------------- INFO NINJA -----------------");
        System.out.println("Nome: " + this.nome + " Uchiha");
        System.out.println("Idade: " + this.idade);
        System.out.println("Missão: " + this.missao);
        System.out.println("Nivel da missão: " + this.nivelDificuldade);
        System.out.println("Status da missão: " + this.statusMissao);
        System.out.println("----------------------------------------------");
    }
}
