package interview_question;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

    public static void main(String[] args) throws MalformedURLException {

        //abc.com -->89.90.98.101

        System.out.println(new URL("https://app.hubspot.com").equals(new URL("https://104.19.154.83")));
        System.out.println(new URL("https://naveenautomationlabs.com").equals(new URL("https://45.130.228.5")));
    }
}
