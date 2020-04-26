package Q1;


public class Q_D {

    public static void main(String[] args) {
        Operation<Integer> print = value -> System.out.printf("%d\n", value);
        print.display(20);
    }

    private interface Operation<T> {

        void display(T t);
    }

}
