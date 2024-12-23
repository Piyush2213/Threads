public class MyThread extends Thread{
    private  Counter count;

    MyThread(Counter count){
        this.count = count;
    }
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++) {
            count.increment();
        }
    }
}
