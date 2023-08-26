package hillel.tsukanova;

import java.util.Scanner;

public class AnagramDZ {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] t = {"SOLO", "LOSO", "OSLO", "OLSO", "OSOL", "OLOS", "SLOO", "LSOO", "OOLS", "OOSL", "LOOS", "SOOL"};

        boolean isValidWord = false;
        while (!isValidWord) {
            System.out.print("Введи слово Solo: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Solo")) {
                isValidWord = true;
            } else {
                System.out.println("Не вірно");
            }
            scanner.nextLine();
        }
        isValidWord = false;
        while (!isValidWord) {
            System.out.print("Створи анограму слова Solo: ");
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
