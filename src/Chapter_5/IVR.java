package Chapter_5;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("press 1 for English: ");
        System.out.println("press 2 for Ibo: ");
        System.out.println("press 3 for French: ");
        System.out.println("press 4 for Yoruba: ");

        int number = input.nextInt();

        switch (number) {
            case 1 -> {
                System.out.println("press1 for data\nPress 2 for transfer");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("data");
                    case 2 -> System.out.println("Transfer");
                }
            }
            case 2 -> {
                System.out.println("press 1 for sharing\nPress 2 for Caring ");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("sharing");
                    case 2 -> System.out.println("Caring");
                }
            }
            case 3 -> {
                System.out.println("press 1 for egg\nPress 2 for champ");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("Egg");
                    case 2 -> System.out.println("Champ");
                }
            }
            case 4 -> {
                System.out.println("press 1 for Ewa\nPress 2 for Ago-yin");
                number = input.nextInt();
                switch (number) {
                    case 1 -> System.out.println("Ewa");
                    case 2 -> System.out.println("Ago-yin");
                }
            }
        }
    }
}