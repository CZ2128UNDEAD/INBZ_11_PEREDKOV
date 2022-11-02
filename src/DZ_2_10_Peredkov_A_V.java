import java.util.Scanner;
public class DZ_2_10_Peredkov_A_V {
    //(Наука: расчет энергии)
    //Напишите программу, которая вычисляет энергию, необходимую для нагрева
    //воды от начальной температуры до конечной. Ваша программа должна предложить пользователю ввести
    //количество воды в килограммах, а также начальную и конечную температуры воды. Формула для
    //вычисления энергии такова Q = M * (finalTemperature – initialTemperature) * 4184
    //где M - вес воды в килограммах, а энергия Q измеряется в джоулях.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение Кол-во воды в кг: ");
        double enterWater_Mass = input.nextDouble();
        System.out.println("Введите значение начальной температуры воды в градусах под цельсию: ");
        double enterStart_Temperature = input.nextDouble();
        System.out.println("Введите значение конечной температуры воды в градусах под цельсию: ");
        double enterEnd_Temperature = input.nextDouble();
        final double currentEnergyJoules = enterWater_Mass * (enterEnd_Temperature - enterStart_Temperature) * 4184;
        System.out.println(" Кол-во воды составляет: " +enterWater_Mass+ " кг"+
                           "\nНачальная температура воды составляет: " +enterStart_Temperature+ " градусов под цельсию"+
                           "\nКонечная температура воды составляет: " +enterEnd_Temperature+ " градусов под цельсию"+
                           "\nНеобходимое количество энергии для нагрева воды в джоулях составляет " +currentEnergyJoules);
    }
}
