package DSA.prac;

public class minmax {

    public static void main(String[] args) {
        int[] a = {1000, 11, 445, 1, 330, 3000};
        int min=0;
        int max=0;
        for (int i =0;i<a.length;i++){
            if(a[i] < a[min]){
                min=i;
            }
            if(a[i] > a[max]){
                max=i;
            }

        }
        System.out.println(a[min]);
        System.out.println(a[max]);
    }
}
