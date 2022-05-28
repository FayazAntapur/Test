package interview_question;

import java.lang.reflect.Field;

public class Test_Language_Trastlator {

    static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello Fayaz", value.get("Kya be chup bait"));
            value.set("What's going on ", value.get("kaam chal raha ha hai bhai"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        System.out.println("Hello Fayaz");
    }
}
