import java.util.Scanner;

public class ToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите массив:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Вывод массива * 2:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]*2);
        }
    }
}
