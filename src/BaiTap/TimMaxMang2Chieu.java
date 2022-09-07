package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.println("Nhap so hang m= ");
        m = sc.nextInt();
        System.out.println("Nhap so cot n= ");
        n = sc.nextInt();

        // nhập mảng 2 chiều

        int[][] arr = new int[m][n];
        System.out.println("nhap cac phan tu trong mang ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                System.out.println("a[" + i + "][" + j + "]=");
                arr[i][j] = sc.nextInt();
            }
        }

        //in ra mảng 2 chiều

        System.out.println("Mang hai chieu vua nhap la ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max = " + max);
    }
}
