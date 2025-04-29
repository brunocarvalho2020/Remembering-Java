package manage_notes;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1. Cadastrar aluno.");
            System.out.println("2. Listar todos alunos.");
            System.out.println("3. Buscar aluno pela matrícula");
            System.out.println("4. Mostrar apenas alunos aprovados.");
            System.out.println("5. Sair");
            opcao = scanf.nextInt();
            scanf.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome:");
                    String nome = scanf.nextLine();

                    System.out.println("Matrícula:");
                    String matricula = scanf.nextLine();

                    System.out.println("Nota Media Final:");
                    double media = scanf.nextDouble();
                    scanf.nextLine();

                    Aluno novo = new Aluno(nome, matricula, media);
                    alunos.add(novo);
                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    System.out.println("Alunos cadastrados:");
                    for (Aluno aluno : alunos) {
                        aluno.exibirDados();
                    }
                    break;

                case 3:
                    System.out.println("Matrícula:");
                    String busca_matricula = scanf.nextLine();
                    boolean achou = false;
                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula().equals(busca_matricula)) {
                            aluno.exibirDados();
                            achou = true;
                        }
                    }
                    if (!achou) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Alunos aprovados:");
                    boolean aprovados = false;
                    for (Aluno aluno : alunos) {
                        if (aluno.getMedia() >= 6) {
                            aluno.exibirDados();
                            aprovados = true;
                        }
                    }
                    if (!aprovados) {
                        System.out.println("Nenhum aluno aprovado.");
                    }
                    break;
                case 5:
                    opcao = 5;
                    break;

            }

        } while (opcao != 5);
        scanf.close();
    }
}
