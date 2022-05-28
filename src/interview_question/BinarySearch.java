package interview_question;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {23,45,56,78,96,123};
        int num = 783;
        int high = a.length-1;
        int low = 0;
        boolean flag = false;

        while (low <=high){
            int mid = (high+low)/2;
            if(a[mid] == num){
                flag=true;
                break;
            }else  if(num > a[mid]){
                low =mid+1;
            }else {
                high = mid -1;
            }

        }
        if(flag){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }
    }
}
