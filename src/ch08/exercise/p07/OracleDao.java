package ch08.exercise.p07;

import javax.crypto.spec.PSource;

public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Oracle에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("Oracle에 삽입");
    }

    @Override
    public void update() {
        System.out.println("Oracle을 수정");
    }

    @Override
    public void delete() {
        System.out.println("Oracle에서 삭제");
    }
}
