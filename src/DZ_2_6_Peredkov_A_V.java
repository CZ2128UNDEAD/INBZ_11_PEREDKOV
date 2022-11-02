import java.util.Scanner;
public class DZ_2_6_Peredkov_A_V {
    //(Суммируйте цифры в целое число)
    //Напишите программу, которая считывает целое число от 0
    //до 1000 и добавляет все цифры в целое число. Например, если целое число равно 932, то сумма всех
    //его цифр равна 14. Подсказка: Используйте оператор '%' для извлечения цифр и используйте оператор
    // '// для удаления извлеченной цифры. Например, 932 '%' 10 = 2 и 932/10 = 93.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 0 до 1000: ");
        int selectNumber = input.nextInt();
        int addOneValue = selectNumber % 10;//Единицы
        selectNumber /= 10;
        int addTwoValue = selectNumber % 10;//Десятки
        selectNumber /= 10;
        int addThreeValue = selectNumber % 10;//Сотни
        int total = addOneValue + addTwoValue + addThreeValue;
        System.out.println("\n Первое значение из сотен: " + addThreeValue +
                "\nВторое значение из десятков: " + addTwoValue +
                "\nТретье значение из единиц: " + addOneValue +
                "\n\nСумма трёх значений: " + addThreeValue + "+" + addTwoValue + "+" + addOneValue + " = " + total);
    }
}
