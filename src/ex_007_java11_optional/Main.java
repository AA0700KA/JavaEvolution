package ex_007_java11_optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
       String[] arr = new String[10];

       Optional<String> op = Optional.ofNullable(arr[5]);
       op.ifPresent(System.out::println);
       op.orElseThrow(ArrayIndexOutOfBoundsException::new);
    }

}
