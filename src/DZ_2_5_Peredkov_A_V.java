import java.util.Scanner;
public class DZ_2_5_Peredkov_A_V {
    //(Финансовое приложение: рассчитайте чаевые)
    //Напишите программу, которая считывает промежуточный
    //итог и размер чаевых, а затем вычисляет чаевые и общую сумму. Например, если пользователь вводит
    //10 для промежуточного итога и 15% для ставки чаевых, программа отображает 1,5 доллара в качестве
    //чаевых и 11,5 доллара в качестве общей суммы.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение промежуточного итога: ");
        double subtotal = input.nextDouble();
        System.out.println("Введите значение чаевой ставки: ");
        double gratuityRate = input.nextDouble();
        final double gratuity = subtotal * (gratuityRate / 100);
        final double total = subtotal + gratuity;
        System.out.println(" Чаевые составляют " + gratuity + "\n Общая сумма составляет " + total);
    }
}