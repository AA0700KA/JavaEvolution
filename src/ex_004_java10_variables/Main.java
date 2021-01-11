package ex_004_java10_variables;

public class Main {

    String global = "Java 10";

    public static void main(String[] args) {
        String local = "java 10";
        var value = "Java 10 var";
        int var = 10;

        value = "Other string";
        // value = 123;
    }
}
