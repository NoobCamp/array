import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] array = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3};
        double[] array1 = {1.57d, 7.654d, 9.986d};
        boolean[] array2 = {true, false, true, false};

        System.out.println("Задание №2");
        for (int a = 0; a < array.length;a++) {
            System.out.print(array[a]);
            if (a != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int a = 0; a < array1.length;a++) {
            System.out.print(array1[a]);
            if (a != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int a = 0; a < array2.length;a++) {
            System.out.print(array2[a]);
            if (a != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("Задание №3");
        for (int a = array.length - 1; a >= 0;a--) {
            System.out.print(array[a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int a = array1.length - 1; a >= 0;a--) {
            System.out.print(array1[a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int a = array2.length - 1; a >= 0;a--) {
            System.out.print(array2[a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание №4");
        for (int b = 0; b < array.length; b++) {
            if (array[b] % 2 != 0) {
                array[b]++; // решил сократить array[b] = array[b] + 1, но кажется так читается хуже, хоть и короче
            }
        } System.out.print(Arrays.toString(array));
    }
}