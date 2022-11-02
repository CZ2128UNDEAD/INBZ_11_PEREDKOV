import java.util.Scanner;
public class DZ_2_2_Peredkov_A_V {
    //(Вычисление объема цилиндра)
    //Напишите программу, которая считывает радиус
    //и длину цилиндра и вычисляет площадь и объем, используя следующие
    //формулы:
    //площадь = радиус * радиус * PI
    //объем = площадь * длина
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.1415;
        System.out.println("Введите значение радиуса: ");
        double radius = input.nextDouble();
        System.out.println("Введите значение длины: ");
        double length = input.nextDouble();//Длина
        final double area = radius * radius * PI;//площадь
        final double volume = area * length;//Объем
        System.out.println("Площадь составляет: " + area + "\n  Объём составляет: " + volume );
    }
}
