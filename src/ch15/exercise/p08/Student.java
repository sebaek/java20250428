package ch15.exercise.p08;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return studentNum == student.studentNum;
    }
}
