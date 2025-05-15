package ch12.sec03.exam01;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member m) {
            return this.id.equals(m.id);
        }
        return false;
    }
}
