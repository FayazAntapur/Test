package DSA.prac;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int [] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[arr.length-1-i];
        }
        for(int j=0;j< arr1.length;j++){
            System.out.print(arr1[j]);
        }
    }
}
