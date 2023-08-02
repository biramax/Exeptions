package Seminar2;/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task_2_4 {

    public static void main(String[] args) {

        run();
    }

    private static void run() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Введите что-нибудь в консоль:");

            String input = sc.nextLine();

            if (input.equals("")) {
                System.err.println("Нельзя вводить пустую строку, попробуйте ещё раз.\n");
            } else {
                break;
            }
        }
    }
}
