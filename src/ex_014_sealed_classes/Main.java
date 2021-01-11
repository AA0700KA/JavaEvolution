package ex_014_sealed_classes;

public class Main {

    public static void main(String[] args) {
        A a = new B();

    }

}

sealed class A permits B,C {

}

non-sealed class B extends A {

}

non-sealed class C extends A {

}

class D {

}
