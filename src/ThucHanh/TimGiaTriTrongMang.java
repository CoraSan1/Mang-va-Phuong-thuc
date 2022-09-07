package ThucHanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten hoc sinh can tim ");
        String ten = sc.nextLine();

        boolean exist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(ten)){
                System.out.println(ten + " vi tri " + i);
                exist = true;
                break;
            }
        }
        if (!exist){
            System.out.println("Khong ton tai ten " + ten);
        }
    }
}
