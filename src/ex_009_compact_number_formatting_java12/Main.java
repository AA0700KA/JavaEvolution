package ex_009_compact_number_formatting_java12;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String form = fmt.format(1200);
        System.out.println(form);
    }

}
