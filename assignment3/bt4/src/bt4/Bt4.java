package bt4;
import java.util.Arrays;
import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap vao so phan tu cua mang: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            
            System.out.println("Nhap vao cac phan tu cua mang:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            
            Arrays.sort(array);
            
            System.out.println("Mang sau khi sap xep tang dan:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }
}