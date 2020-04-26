package Q1;


public class Q_C {

    public static void main(String[] args) {
        Operation print = () -> {
            return "Welcome to lambdas!";
        };
        System.out.println(print.display());
    }

    private interface Operation {

        String display();
    }
}
