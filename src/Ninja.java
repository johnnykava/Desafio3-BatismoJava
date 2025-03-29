public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String nivelDificuldade;
    private String statusMissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }

    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao){
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes(){
        System.out.println("----------------- INFO NINJA -----------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Missão: " + getMissao());
        System.out.println("Nivel da missão: " + getNivelDificuldade());
        System.out.println("Status da missão: " + getStatusMissao());
        System.out.println("----------------------------------------------");
    }
}
