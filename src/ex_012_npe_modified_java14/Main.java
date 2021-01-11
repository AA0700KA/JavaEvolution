package ex_012_npe_modified_java14;

public class Main {

    User getUser() {
        return null;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.getUser().getEmployee().hi();
    }

}

class User {

    Employee getEmployee() {
        return new Employee();
    }

}

class Employee {

    void hi() {
        System.out.println("Hi");
    }

}
