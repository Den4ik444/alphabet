package alphabet;

import java.util.Scanner;

public class alphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        char abc[] =  alphabet.toCharArray();
        char notAbc[] = new char[33]; //кол-во букв алфавите

        boolean allLetters = true;

        System.out.print("Введи свое предложение: ");
        String str = scanner.nextLine();

        for (int i = 0; i < abc.length; i++){
            int index = str.indexOf(abc[i]);
            if (index == -1) {
                notAbc[i] = abc[i];
                allLetters = false;
            }
        }
        if (!allLetters){
            System.out.println("В этом предложени нет этих букв: " + new String(notAbc));
        } else {
            System.out.println("В этом предложении есть все буквы!");
        }
    }
}