package interview_question;

public class Student {

    private String name;
    private int marks;
    private int rollnum;
    private int age;

    public Student(String name, int rollnum, int marks, int age){

        this.name = name;
        this.rollnum = rollnum;
        this.marks = marks;
        this.age = age;

    }

    public String getName(){
        return name;
    }
    public int getRollnum(){
        return rollnum;
    }
    public int getMarks(){
        return marks;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return "name: "+name + " rollnum: "+rollnum+" marks: "+marks+" age: "+age;
    }


}
