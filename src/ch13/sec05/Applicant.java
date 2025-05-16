package ch13.sec05;

public class Applicant<T> {
    private T kind;

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }
}
