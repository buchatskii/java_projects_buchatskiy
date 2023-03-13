import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        long summ = 0;
        long proizved = 1;
        final Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int to = sc.nextInt();
        for (int i = 1; i <= to; i++) {
        summ += i;
        proizved *= i;
        }

        System.out.println(summ);
        System.out.println(proizved);
}
}
