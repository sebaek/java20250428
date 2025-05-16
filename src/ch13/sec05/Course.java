package ch13.sec05;

public class Course {
    public static void registerCourse1(Applicant<?> applicant) {
        Object kind = applicant.getKind();
        kind.toString();
//        applicant.setKind(new Object());
    }

    public static void registerCourse2(Applicant<? extends Student> applicant) {
        // producer extends (pecs)
        Student kind = applicant.getKind();
    }

    public static void registerCourse3(Applicant<? super Worker> applicant) {
        // consumer super (pecs)
        applicant.setKind(new Worker());
    }

}
