package bt1;
import java.util.Random;
import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Random rand = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int n = rand.nextInt(100) + 1; // Tạo số ngẫu nhiên từ 1 đến 100
                System.out.print("Nhap vAo check (yes or bat ky): ");
                String check = scanner.nextLine();
                
                if (check.equalsIgnoreCase("yes")) {
                    // Tiếp tục chương trình
                    if (n % 2 == 0) {
                        System.out.println(n + " la so chan");
                    } else {
                        System.out.println(n + " la so le");
                    }
                } else {
                    // Thoát vòng lặp
                    if (n % 2 == 0) {
                        System.out.println(n + " la so chan");
                    } else {
                        System.out.println(n + " la so le");
                    }
                    break;
                }
            }
        }
    }
}
