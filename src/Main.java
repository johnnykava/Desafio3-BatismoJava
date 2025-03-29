import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ninja[] ninja = new Ninja[1];
        Ninja[] auxNinja = new Ninja[1];

        Uchiha[] ninjaUchiha = new Uchiha[1];
        Uchiha[] auxUchiha = new Uchiha[1];


        int escolha = 0, indiceComun = 0, indiceUchiha = 0;
        do{
            System.out.println("----------------- MENU -----------------");
            System.out.println("[1] Cadastrar novo Ninja");
            System.out.println("[2] Exibir todos os Ninjas");
            System.out.println("[3] Atualizar habilidade especial");
            System.out.println("[4] Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println("----------------------------------------");

            switch(escolha){
                case 1:
                    System.out.println("Qual deseja cadastrar?");
                    System.out.println("[1] Ninja Comum");
                    System.out.println("[2] Ninja Uchiha");
                    int escolhaNinja = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do ninja: ");
                    String nomeNinja = scanner.nextLine();

                    System.out.print("Digite a idade do ninja: ");
                    int idadeNinja = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a missão do ninja: ");
                    String missaoNinja = scanner.nextLine();

                    System.out.print("Digite o nivel de dificuldade da missão (S, A, B, C, D): ");
                    String nivelMissao = scanner.nextLine();

                    System.out.println("Digite o status da missão (concluida, não concluida):");
                    String statusMissao = scanner.nextLine();

                    if(escolhaNinja == 1){
                        if(ninja[0] == null){
                            ninja[indiceComun] = new Ninja(nomeNinja, idadeNinja, missaoNinja, nivelMissao, statusMissao);

                            indiceComun++;
                        }
                        else{
                            auxNinja = new Ninja[indiceComun + 1];

                            for(int i = 0; i < ninja.length; i++){
                                auxNinja[i] = ninja[i];
                            }

                            ninja = new Ninja[indiceComun + 1];

                            for(int i = 0; i < auxNinja.length; i++){
                                ninja[i] = auxNinja[i];
                            }

                            ninja[indiceComun] = new Ninja(nomeNinja, idadeNinja, missaoNinja, nivelMissao, statusMissao);

                            indiceComun++;
                        }
                    }
                    else if(escolhaNinja == 2){
                        if(ninjaUchiha[0] == null){
                            ninjaUchiha[indiceUchiha] = new Uchiha(nomeNinja, idadeNinja, missaoNinja, nivelMissao, statusMissao);

                            indiceUchiha++;
                        }
                        else{
                            auxUchiha = new Uchiha[indiceUchiha + 1];

                            for(int i = 0; i < ninjaUchiha.length; i++){
                                auxUchiha[i] = ninjaUchiha[i];
                            }

                            ninjaUchiha = new Uchiha[indiceUchiha + 1];

                            for(int i = 0; i < auxUchiha.length; i++){
                                ninjaUchiha[i] = auxUchiha[i];
                            }

                            ninjaUchiha[indiceUchiha] = new Uchiha(nomeNinja, idadeNinja, missaoNinja, nivelMissao, statusMissao);

                            indiceUchiha++;
                        }
                    }
                    break;

                case 2:
                    if(ninja[0] != null){
                        System.out.println("----------- Ninjas Comuns -----------");
                        for(int i = 0; i < ninja.length; i++){
                            ninja[i].mostrarInformacoes();
                        }
                        System.out.println("-------------------------------------");
                    }
                    else{
                        System.out.println("Nenhum Ninja Comum cadastrado");
                    }

                    System.out.println();

                    if(ninjaUchiha[0] != null){
                        System.out.println("----------- Ninjas Uchiha -----------");
                        for(int i = 0; i < ninjaUchiha.length; i++){
                            ninjaUchiha[i].mostrarInformacoes();
                        }
                        System.out.println("-------------------------------------");
                    }
                    else{
                        System.out.println("Nenhum Ninja Uchiha cadastrado");
                    }
                    break;

                case 3:
                    System.out.println("Qual desses ninja você quer alterar a habilidade?");

                    for(int i = 0; i < ninjaUchiha.length; i++){
                        System.out.println("Código: " + i);
                        ninjaUchiha[i].mostrarInformacoes();
                    }

                    System.out.print("Digite o código do ninja: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a nova habilidade especial: ");
                    String habilidadeEspecial = scanner.nextLine();

                    ninjaUchiha[codigo].setHabilidadeEspecial(habilidadeEspecial);
                    break;

                case 4:
                    System.out.println("Obrigao por usar o Sistema! Saindo.....");
                    break;

                default:
                    System.out.println("Nenhuma opção digitada é valida, favor digite um número valido do menu!");
                    break;
            }

        }while(escolha != 4);
    }
}
