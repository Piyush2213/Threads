public class MyTread extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        MyTread t1 = new MyTread();
        System.out.println(t1.getState()); // New state till this time...
        t1.start();
        System.out.println(t1.getState()); // Runnable State
        Thread.sleep(10000);
        System.out.println(t1.getState()); // Time_Waiting, because it is sleep
        t1.join(); // This allows the caller funtion to wait its execution till the called function terminates.
        System.out.println(t1.getState());


    }
}
