package Project;

import java.util.Scanner;

import static Project.Menu.sc;

public class DeleteName {

    public static void delete() {
        ListNames.list();
        if (!registerName.nomes.isEmpty()) {
            System.out.print("Digite o índice do nome a ser excluído: ");
            int indices = sc.nextInt();
            if (indices >= 0 && indices < registerName.nomes.size()) {
                registerName.nomes.remove(indices);
                System.out.println("Nome excluído com sucesso!");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }}