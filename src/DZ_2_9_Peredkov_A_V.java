import java.util.Scanner;
public class DZ_2_9_Peredkov_A_V {
    //(Физика: ускорение)
    //Среднее ускорение определяется как изменение скорости, деленное на время,
    //затраченное на изменение, как указано в следующей формуле: a = v1 - v0 / t
    //Напишите программу, которая предложит пользователю ввести начальную скорость v0 в метрах/
    //во-вторых, конечная скорость v1 в метрах в секунду и промежуток времени t в секундах, затем
    //отображается среднее ускорение.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение начальной скорости: ");
        double enterV0 = input.nextDouble();
        System.out.println("Введите значение конечной скорости: ");
        double enterV1 = input.nextDouble();
        System.out.println("Введите значение промежутка времени: ");
        double enterT = input.nextDouble();
        final double average = enterV1 - enterV0 / enterT;//(переменная закрепленна как константа)

        System.out.println( " Начальная скорость в метрах составляет: " +enterV0+
                            "\nКонечная скорость в метрах составляет: " +enterV1+
                            "\nПромежуток времени в секундах составляет: " +enterT+
                            "\nСреднее ускорение составляет " +average);
    }
}
