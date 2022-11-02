import java.util.Scanner;
public class DZ_2_4_Peredkov_A_V {
    //(Перевести фунты в килограммы)
    //Напишите программу, которая преобразует фунты в
    //килограммы. Программа предлагает пользователю ввести число в фунтах, преобразует его
    //в килограммы и отображает результат.
    //Фунт(pounds) = 0,454 килограмма.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите кол-во фунтов: ");
        double pounds = input.nextDouble();//ФУНТ
        final double kilograms = pounds * 0.454;//КГ=ФУНТ*0.454(переменная закрепленна как константа)
        System.out.println(pounds + " Фунтов равен " + kilograms + " килограммам");
    }
}
