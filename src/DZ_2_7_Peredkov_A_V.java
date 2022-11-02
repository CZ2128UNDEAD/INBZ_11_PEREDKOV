import java.util.Scanner;
public class DZ_2_7_Peredkov_A_V {
    //(Найдите количество лет)
    //Напишите программу, которая предложит пользователю ввести минуты
    //(например, 1 миллиард) и отобразит максимальное количество лет и оставшихся дней для минут.
    //Для простоты предположим, что в году 365 дней.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во минут: ");
        int enterMinutes = input.nextInt();
        int years = enterMinutes / 525600;
        int days = (enterMinutes % 525600) / 1440;
        System.out.println("Кол-во минут составляет: " + enterMinutes +
                "\nИз этого значения количество лет составляет: " + years +
                "\nИз этого значения количество дней составляет: " + days);
    }
}
