import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\n Укажите арифметическое действие:(+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                if (num2 == 0) {
                    System.out.printf("Деление на ноль - ошибка!");
                }
                else;
                    break;
            default: System.out.printf("Ошибка!");
            return;
        }
        System.out.print("\n Получившийся результат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
