package ThucHanh;

public class TimMinDungPhuongThuc {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9,10};
        int index = minValue(arr);
        System.out.println("so nho nhat trong mang la " + arr[index]);
    }

    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < array[index]){
                array[index] = array[i];
                index = i;
            }
        }
        return index;
    }

}
