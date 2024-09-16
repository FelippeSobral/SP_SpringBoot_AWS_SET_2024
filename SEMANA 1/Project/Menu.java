package Project;
import java.util.Scanner;

import static Project.DeleteName.delete;
import static Project.ListNames.list;
import static Project.registerName.registerName;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {

            System.out.println("\nMenu");
            System.out.println("1. Register name");
            System.out.println("2. List names");
            System.out.println("3. Delete name");
            System.out.println("0. Leave program");
            System.out.print("Choose an option: ");
            opcao = sc.nextInt();
            sc.nextLine();

                    switch (opcao) {

                        case 1:
                            registerName();
                            break;
                        case 2:
                            list();
                            break;
                        case 3:
                            delete();
                            break;

                        case 0:
                            System.out.println("Leaving program...");
                            break;
                            default:
                                System.out.println("Invalid Option, Try Again.");
                    }




            }
            while (opcao != 0) ;
        }}
