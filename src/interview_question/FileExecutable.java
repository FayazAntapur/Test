package interview_question;

import java.io.File;
import java.lang.reflect.Field;

public class FileExecutable {
    public static void main(String[] args) {

        File f= new File("");
        f.setExecutable(true,true);
        f.setReadable(true);

    }
}
