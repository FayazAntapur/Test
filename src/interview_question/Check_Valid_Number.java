package interview_question;

public class Check_Valid_Number {

    public static void main(String[] args) {
        //System.out.println(isNUmber("234234p"));
        System.out.println(validPhoneNumber("3453423235"));
        System.out.println(isPassword("254354564L"));
    }

    public static boolean isNUmber(String number){

        try{
        Long.parseLong(number);
        System.out.println("valid number");
        return true;
        }catch (NumberFormatException e){
            System.out.println("invalid number");
            return false;
        }

    }

    public static boolean validPhoneNumber(String number){

        if(number.length()==10 && isNUmber(number)){

            System.out.println("valid phone number");
            return true;
        }
        System.out.println("invalid phone number");
        return false;
    }

    public static boolean isCorrectNumber(String number){
        return number.matches("[0-9]{10}");
    }

    public static boolean isPassword(String number){
        return number.matches("[0-9][A-Z]{10}");
    }


}
