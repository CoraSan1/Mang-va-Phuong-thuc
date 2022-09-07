package ThucHanh;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int c;

        for (int i = 0; i<arr.length/2; i++){
            c = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = c;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

}

