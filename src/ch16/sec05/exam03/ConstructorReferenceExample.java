package ch16.sec05.exam03;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        Creatable1 c1 = a -> new Member(a);
        Creatable1 c2 = Member::new;

        Creatable2 c3 = (a, b) -> new Member(a, b);
        Creatable2 c4 = Member::new;

        Person person = new Person();
        person.getMember1(c2);
        person.getMember2(c4);

        person.getMember1(Member::new);
        person.getMember2(Member::new);
    }
}
