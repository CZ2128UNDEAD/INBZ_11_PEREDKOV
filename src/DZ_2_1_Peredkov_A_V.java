import java.util.Scanner;
public class DZ_2_1_Peredkov_A_V {
    //(Преобразование градуса Цельсия в градус Фаренгейта)
    //Напишите программу, которая считывает градус Цельсия в
    //двойном значении с консоли,затем преобразует его в градус Фаренгейта и отображает
    //результат.
    //Формула для преобразования выглядит следующим образом:
    //Фаренгейт = (9/5) * цельсий + 32
    //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру в градусах цельсия:");
        double celsius = input.nextDouble();
        final double fahrenheit = 9.0/5*celsius+32;
        System.out.println(fahrenheit);
    }
}
