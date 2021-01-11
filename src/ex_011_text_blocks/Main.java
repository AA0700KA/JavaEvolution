package ex_011_text_blocks;

public class Main {

    public static void main(String[] args) {
        String block = "Hello budy," +
                "my name is.." +
                "And my text about Java" +
                "Java 13 has text block" +
                "in priviuw :)";

        System.out.println(block);

        block =  """
                Hello budy," +
                "my name is.." +
                "And my text about Java" +
                "Java 13 has text block" +
                "in priviuw :)";
                """;
        System.out.println(block);
    }

}
