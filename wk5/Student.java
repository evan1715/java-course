package wk5;

//Exercise 88: Student

public class Student {
    private String name, studentNum;


    public Student(String name, String studentNum) {
        this.name = name;
        this.studentNum = studentNum;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentNum() {
        return this.studentNum;
    }

    public String toString() {
        return this.name +" (" +this.studentNum +")";
    }

}