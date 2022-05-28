package interview_question;

import java.util.ArrayList;
import java.util.List;

public class FingHighestMarks {

    public static void main(String[] args) {

        Student s1 = new Student("Virat",1,120,31);
        Student s2 =  new Student("Rohit", 2, 80, 34);
        Student s3 = new Student("Rahul", 3, 89,28);
        Student s4 = new Student("Rishab", 4, 45,25);
        Student s5 = new Student("Shami", 5, 100, 28);

        List<Student> student = new ArrayList<Student>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);

        for(Student s:student){
            System.out.println(s);
        }

        System.out.println("using streams");
        student.forEach(System.out::println);
        System.out.println("highest streams");
        student.stream().filter(e -> e.getMarks() > 80).forEach(e -> System.out.println(e));

        System.out.println("max marsk");
        int i = student.stream().map(e -> e.getMarks()).max(Integer::compare).get();
        System.out.println(i);
        System.out.println("get name");
        student.stream().filter(e -> e.getMarks()==i).forEach(e -> System.out.println(e.getName()));

    }

}
