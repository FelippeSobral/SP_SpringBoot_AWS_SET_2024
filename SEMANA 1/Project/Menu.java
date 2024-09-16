package Project;

import java.util.Scanner;

import static Project.registerName.cadastrarNome;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Cadastrar nome");
            System.out.println("2. Listar nomes");
            System.out.println("3. Excluir nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

                    switch (opcao) {

                        case 1:
                            cadastrarNome();
                            break;

                    }


            }
            while (opcao != 0) ;
        }}
