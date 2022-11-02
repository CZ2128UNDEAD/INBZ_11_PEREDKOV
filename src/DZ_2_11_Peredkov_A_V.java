import java.util.Scanner;
public class DZ_2_11_Peredkov_A_V {
    //(Прогноз численности населения)
    //Перепишите упражнение по программированию 1.11, чтобы предложить
    //пользователю ввести количество лет и отобразить численность населения после количества лет.
    //Используйте подсказку в упражнении по программированию 1.11 для этой программы.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите количество лет которое должно пройти для расчета: ");
        int enterLaterYears = input.nextInt();
        int SecondsYear = 31536000;//365 дней * 24 часа * 60 минут * 60 секунд = кол-во сек в году
        int birthsYear = SecondsYear / 7;// Секунды в год делим на секунды рождения
        int deathsYear = SecondsYear / 13;// Секунды в год делим на секунды смерти
        int immigrantsYear = SecondsYear / 45;// Секунды в год делим на секунды прибывания иммигранта
        int people = 312032486 + (((birthsYear) - (deathsYear) + (immigrantsYear)) * enterLaterYears);
        System.out.println( "Население через : " +enterLaterYears+ " лет составляет " +people + " человек");
        //Прогноз населения через 'n' лет
    }
}
