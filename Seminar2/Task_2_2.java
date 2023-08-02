package Seminar2;/*
Если необходимо, исправьте данный код
 */

public class Task_2_2 {

    public static void main(String[] args) {

        try {
            // Не введена переменная intArray
            int[] intArray = new int[10];

            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);

            // Можно было бы сделать более человечным вывод ошибки
            System.err.println("Нельзя делить на ноль");
        }
    }
}
