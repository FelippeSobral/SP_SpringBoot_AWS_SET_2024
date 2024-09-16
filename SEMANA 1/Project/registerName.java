package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class registerName {
    public static ArrayList<String> nomes = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarNome() {
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        nomes.add(nome);
        System.out.println("Nome cadastrado com sucesso!");
    }
}
