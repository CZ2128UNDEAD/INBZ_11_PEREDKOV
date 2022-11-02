import java.util.Scanner;
public class DZ_2_8_Peredkov_A_V {
    //(Текущее время)
    //2.7, ShowCurrentTime.java , выдает программу, которая отображает текущее
    //время в GMT. Измените программу таким образом, чтобы она предлагала пользователю ввести смещение
    //часового пояса на GMT и отображала время в указанном часовом поясе.
    //78 страница документации.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите смещение часового пояса по Гринвичу: ");
        int offset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        // totalMilliseconds - Общее кол-во миллисекунд, прошедших с 24:00 1 января 1970 года.
        long totalSeconds = totalMilliseconds / 1000;
        // totalSeconds - общее кол-во секунд с полуночи 1 января 1970 года
        long currentSecond = totalSeconds % 60;
        // currentSecond - Вычисление текущей секунды в минуте в часе
        long totalMinutes = totalSeconds / 60;
        // totalMinutes - Общее кол-во минут
        long currentMinute = totalMinutes % 60;
        // currentMinute - Вычисление текущей минуты в часе
        long totalHours = totalMinutes / 60;
        // totalHours - Общее кол-во часов
        long currentHour = (totalHours % 24) + offset;
        // currentHour - Вычисление текущего часа
        System.out.println(" Текущее время составляет: " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
