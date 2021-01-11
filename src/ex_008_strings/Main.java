package ex_008_strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
         String blank = "Hello ";

        System.out.println(blank.isBlank());

        blank = "           ";

        System.out.println(blank.isBlank());
        System.out.println(blank.isEmpty());

        String line = "Hello\n " +
                "Budy\n" +
                "Okey, I know";


        line.lines().forEach(System.out::println);

        List<String> lines = line.lines().collect(Collectors.toList());

        System.out.println(lines);

        String text = "Hello ";

        System.out.println(text.repeat(5));
    }

}
