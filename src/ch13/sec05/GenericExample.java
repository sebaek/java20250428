package ch13.sec05;

public class GenericExample {
    public static void main(String[] args) {
        Course.registerCourse1(new Applicant<Person>());
        Course.registerCourse1(new Applicant<Worker>());
        Course.registerCourse1(new Applicant<Student>());
        Course.registerCourse1(new Applicant<HighStudent>());
        Course.registerCourse1(new Applicant<MiddleStudent>());

        Course.registerCourse2(new Applicant<Student>());
        Course.registerCourse2(new Applicant<HighStudent>());
        Course.registerCourse2(new Applicant<MiddleStudent>());
//        Course.registerCourse2(new Applicant<Person>());

        Course.registerCourse3(new Applicant<Worker>());
        Course.registerCourse3(new Applicant<Person>());
        Course.registerCourse3(new Applicant<Object>());
    }
}
