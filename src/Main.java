// Задача 1
//import java.util.Scanner;
//public class Main {
//public static void main(String[] args) {
//        long summ = 0;
//        long proizved = 1;
//        final Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int to = sc.nextInt();
//        for (int i = 1; i <= to; i++) {
//        summ += i;
//        proizved *= i;
//        }
//
//        System.out.println(summ);
//        System.out.println(proizved);
//}
//}
// Задача 2
//public class Main {
//    public static void main(String[] args){
//            for (int i = 1; i < 1000; i++) {
//                    if (simpleNumber(i)){
//                            System.out.print(i + " ");
//                    }
//            }
//    }
//        public static boolean simpleNumber(int number){
//                for (int i = 2; i <= number / 2; i++){
//                        if (number % i ==0)
//                        return false;
//                }
//                return true;
//        }
//}
//Задача 3
import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        double num1;
//        double num2;
//        double ans;
//        char op;
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Введите два числа: ");
//        num1 = reader.nextDouble();
//        num2 = reader.nextDouble();
//        System.out.print("\n Укажите арифметическое действие:(+, -, *, /): ");
//        op = reader.next().charAt(0);
//        switch(op) {
//            case '+': ans = num1 + num2;
//                break;
//            case '-': ans = num1 - num2;
//                break;
//            case '*': ans = num1 * num2;
//                break;
//            case '/': ans = num1 / num2;
//                break;
//            default:  System.out.printf("Ошибка!");
//                return;
//        }
//        System.out.print("\n Получившийся результат:\n");
//        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
//    }
//}