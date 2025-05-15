package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // hashCode
    @Override
    public int hashCode() {
        return no + name.hashCode();
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student o) {
            return this.no == o.no && this.name.equals(o.name);
        }
        return false;
    }
}
