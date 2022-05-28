package interview_question;

public class CheckBinary {
    public static void main(String[] args) {
        isBinary(345341);
        isBinary(1010);
        isBinary(-1);

    }

    public static boolean isBinary(int num){
        boolean isBinaryNumber = false;

        while (num >0){
            int rem = num%10;
            if(rem >1){
                isBinaryNumber=false;
                break;
            }else {
                    num = num/10;
                    isBinaryNumber = true;
            }

        }
        if(isBinaryNumber){
            System.out.println("valid binary number");
        }else {
            System.out.println("not a valid binary");

        }
        return isBinaryNumber;
    }
}
