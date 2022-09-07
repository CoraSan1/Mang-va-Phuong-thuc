package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[6];

        System.out.print("nhap phan tu mang 1: ");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.print("nhap phan tu mang 2: ");
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        int index = 0;
        for (int i : arr1){
            arr3[index] = i;
            index++;
        }
        for (int i : arr2){
            arr3[index] = i;
            index++;
        }
        System.out.println("Mang 3 sau khi gop la");
        System.out.println(Arrays.toString(arr3));
    }
}
