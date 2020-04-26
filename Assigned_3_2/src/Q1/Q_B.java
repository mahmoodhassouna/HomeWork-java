package Q1;

import java.util.function.Function;


public class Q_B {

    public static void main(String[] args) {
        Function<String, String> toUpper_lambda = String::toUpperCase;
        System.out.println(toUpper_lambda.apply("fgdfg"));
    }
}
