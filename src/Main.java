// Задача 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
            int number = sc.nextInt();
        System.out.println("Сумма чисел от 1 до введенного = " + triangular(number));
        System.out.printf("Произведение чисел от 1 до введенного = %d", factorial(number));
        sc.close();
    }

    // Сумма чисел до n
    public static int triangular(int number) {
        int triangleNumber = (number * (number + 1)) / 2;
        return triangleNumber;
    }
    // Произведение чисел до n
    public static int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number-1);

    }
}
