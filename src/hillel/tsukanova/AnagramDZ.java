package hillel.tsukanova;

import java.util.Scanner;

public class AnagramDZ {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] t = {"SOLO", "LOSO", "OSLO", "OLSO", "OSOL", "OLOS",
                "SLOO", "LSOO", "OOLS", "OOSL", "LOOS", "SOOL"};
        String s="Solo";
        System.out.println("Задане слово : " + s);
        System.out.println();

        boolean isValidWord = false;
        while (!isValidWord) {
            System.out.print("Створи анограму цього слова: ");
            String input = scanner.nextLine();

            for (String valid : t) {
                if (input.equalsIgnoreCase(valid)) {
                    isValidWord = true;
                    break;
                }
            }
            if (!isValidWord) {
                System.out.println("Подумай");
            }
            scanner.nextLine();
        }
        System.out.println("Молодець (◕‿◕)");
        scanner.close();
    }
}
