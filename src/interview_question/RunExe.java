package interview_question;

import java.io.IOException;

public class RunExe {

    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime run = Runtime.getRuntime();
        String s[] = new String[]{"notepad.exe"};
        Process p=run.exec(s);
        Thread.sleep(4000);
        p.destroy();
    }
}
