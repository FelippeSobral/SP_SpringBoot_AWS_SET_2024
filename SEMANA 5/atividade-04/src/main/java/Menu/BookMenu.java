package Menu;

import Services.BookServices;

import java.util.Scanner;

public class BookMenu {
    private BookServices.BookService bookService = new BookServices.BookService();
    private Scanner sc = new Scanner(System.in);

    public  void viewMenu(){
        boolean repeat = true;

        while(repeat){
            System.out.println("\n===== Sistema da Biblioteca =====");
            System.out.println("1. Inserir Livros Padrão");
            System.out.println("2. Apagar Livro");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Consultar Livros por Autor");
            System.out.println("5. Consultar Livros por Ano");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    bookService.createBooks();
                    break;
                case 2:
                    bookService.deleteBook();
                    break;
                case 3:
                    bookService.updateBook();
                    break;
                case 4:
                    bookService.findBooksByAuthor();
                    break;
                case 5:
                    bookService.findBooksByYear();
                    break;
                case 6:
                    repeat = false;
                    break;
                default:
                    System.out.println("Back");
            }
        }
    }
}





