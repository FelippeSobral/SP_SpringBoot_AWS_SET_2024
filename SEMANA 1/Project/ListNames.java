package Project;

public class ListNames {

    public static void list() {
        if (registerName.nomes.isEmpty()) {
            System.out.println("Nenhum nome cadastrado.");
        } else {
            System.out.println("Nomes cadastrados:");
            for (int i = 0; i < registerName.nomes.size(); i++) {
                System.out.println(i + ": " + registerName.nomes.get(i));
            }
        }
    }
}