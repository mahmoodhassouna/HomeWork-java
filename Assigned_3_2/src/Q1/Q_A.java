package Q1;

import java.util.function.Consumer;


public class Q_A {
    public static void main(String[] args) {
        Consumer<Integer> print = value -> System.out.println(value);
        print.accept(20);
    }
}
