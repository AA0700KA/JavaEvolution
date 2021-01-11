package ex_010_new_switch_java12;

public class Main {

    public static void main(String[] args) {
        String word = "Cloudy";

        String translated = switch (word) {
            case "Cold" -> "Холодно";
            case "Hot" -> "Жарко";
            case "Sunny" -> "Солнечно";
            case "Cloudy" ->  "Облачно";
            case "Windy" -> "Ветренно";
            default -> "Нет такого слова";
        };

        //System.out.println(translated);
    }

}
