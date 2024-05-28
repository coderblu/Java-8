package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };
        new Thread(runnable).start();

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();
    }
}
