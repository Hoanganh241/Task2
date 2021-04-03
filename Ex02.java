package task2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int i, j, m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chieu dai cua hinh chu nhat: ");
        m = scanner.nextInt();
        System.out.println("Nhap vao chieu rong cua hinh chu nhat: ");
        n = scanner.nextInt();

        if (m >= n) {
            System.out.println("Hinh chu nhat ban yeu cau:");
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= n; j++) {
                    System.out.print("|--");
                }
                System.out.println("");
            }
        }
        else {
            System.out.println("Vui long nhap vao chieu dai lon hon chieu rong!");
        }
    }
}