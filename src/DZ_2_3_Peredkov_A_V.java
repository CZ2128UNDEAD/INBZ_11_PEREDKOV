import java.util.Scanner;
public class DZ_2_3_Peredkov_A_V {
    //(Перевести Футы в Метры)
    //Напишите программу, которая считывает число в футах, преобразует его
    //в метры и отображает результат.
    //Фут = 0,305 метра.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во футов: ");
        double feet = input.nextDouble();
        final double metres = feet * 0.305;//(переменная закрепленна как константа)
        System.out.println(feet + " Футов равняется " + metres + " метрам ");
    }
}
