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
        System.out.println("Nome: " + getNome() + " Uchiha");
        System.out.println("Idade: " + getIdade());
        System.out.println("Missão: " + getMissao());
        System.out.println("Nivel da missão: " + getNivelDificuldade());
        System.out.println("Status da missão: " + getStatusMissao());
        System.out.println("----------------------------------------------");
    }
}
