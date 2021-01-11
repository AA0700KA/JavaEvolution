package ex_013_pattern_matching_instance_of;

public class Main {

    private static boolean checkStandart(Object o) {
        if (o instanceof String) {
            String s = (String) o;
            return s.isBlank();
        }

        return false;
    }

    private static boolean checkJava15(Object o) {
        if (o instanceof String s) {
            return s.isBlank();
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkJava15("    "));
        System.out.println(checkStandart("  "));
        System.out.println(checkStandart("abc"));
        System.out.println(checkJava15(new Main()));
    }

}
