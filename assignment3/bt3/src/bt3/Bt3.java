package bt3;
import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao so phan tu cua mang : ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            
            System.out.println("Nhap vao cac phan tu cua mang :");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            
            double average = (double) sum / size;
            
            System.out.println("Tong gia tri phan tu: " + sum);
            System.out.println("Gia tri trung binh: " + average);
    }
}