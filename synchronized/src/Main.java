public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        MyThread t1 = new MyThread(count);
        MyThread t2 = new MyThread(count);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Here we do not get the result as 2000 in most of the run...
        // This is because we are not calling the inc function in a synchronized way...
        // Fist we are calling through t1 but eventually in middle the run goes to t2 so they both incrementing the same value in some of the case...
        // To get the value in sync way we have to declare the synchronized keyword on the function where it is incrementing the value --> (counter.class)
        System.out.println("After Increment Value is: " + count.getCounter());
    }
}