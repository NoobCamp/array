import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] array = {1000, 250, 500, 10, 100};
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание №2");
        int[] array1 = {1000, 250, 500, 10, 100};
        Arrays.sort(array1);
        System.out.println("Минимальная сумма трат за неделю составила " + array1[0] + " рублей. Максимальная сумма трат за неделю составила " + array1[array1.length - 1] + " рублей");

        System.out.println("Задание №2 вариант 2"); // решил попробовать без sort сделать дополнительно
        int max = -1;
        for (final int current : array1) {
            if (current > max) {
                max = current;
            }
        }
        int min = max;
        for (final int current : array1) {
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Задание №3");
        double[] array3 = {1000, 250, 500, 10, 100};
        double average = 0;
        for (double v : array3) {
            average += v;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (average / array3.length) + " рублей");

        System.out.println("Задание №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int a = reverseFullName.length - 1; a >= 0; a--) {
            System.out.print(reverseFullName[a]);
        }
    }
}