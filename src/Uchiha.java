public class Uchiha extends Ninja{
    String habilidadeEspecial = "Sharingan";

    public Uchiha(String nome, int idade, String missao, char nivelDificuldade, String statusMissao) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
