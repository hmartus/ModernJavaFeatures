package _06_switch_expressions;

public class MainApplication {

    //using Enum
    public enum SingleUsePlastic {
        SPOON, FORK, BOTTLE, CUP
    }

    public int calculateDamageToPlanet(SingleUsePlastic plastic) {
        return switch (plastic) {
            case BOTTLE -> 1000;
            case FORK,CUP -> 500;
            case SPOON -> {
                int temp=10;
                yield 30;
            }
        };
    }

    // another example, with new keyword "when"
    static String processInputOld(String input) {
        String output;
        switch (input) {
            case null -> output = "Oops, null";
            case String s -> {
                if ("Yes".equalsIgnoreCase(s)) {
                    output = "It's Yes";
                } else if ("No".equalsIgnoreCase(s)) {
                    output = "It's No";
                } else {
                    output = "Try Again";
                }
            }
        }
        return output;
    }

    static String processInputNew(String input) {
        String output;
        switch (input) {
            case null -> output = "Oops, null";
            case String s when "Yes".equalsIgnoreCase(s) -> output = "It's Yes";
            case String s when "No".equalsIgnoreCase(s) -> output = "It's No";
            case String s -> output = "Try Again";
        }
        return output;
    }

    public static void main(String[] args) {

        //using enum
        MainApplication app = new MainApplication();
        System.out.println(app.calculateDamageToPlanet(SingleUsePlastic.FORK));

        //another example
        System.out.println(processInputOld("Yes")); //It's Yes
        System.out.println(processInputNew("Yes")); //It's Yes

        System.out.println(processInputOld("TUP Manila")); // Try Again
        System.out.println(processInputNew("TUP Manila")); // Try Again
    }
}
