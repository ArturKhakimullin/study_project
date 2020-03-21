package Xakaton;

import java.util.Scanner;

public class Main {

    public static boolean checkName(String name) {
        if (name) {                                                       //как сделать условие валидности
            System.out.println("");
            return false;
        } else {
            System.out.println("");
            return true;
        }
    }

    public static String regName() {
        System.out.println("Введите имя:");
        return new Scanner(System.in).nextLine();
    }
}