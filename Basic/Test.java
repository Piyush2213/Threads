public class Test {
    public static void main(String[] args) {

        // Word class extends the Thread class so we can easily call the start method
//        Word word = new Word();   // New State of thread....
//        word.start();  //Runnable State, executes when cpu get time
            // After this it will be in running state.
            // After that terminated..

        // This is the same work we are doing in upper code...
        // This is done by implementing the Runnable class in Word2...
        Word2 word2 = new Word2();
        Thread t1 = new Thread(word2);
        t1.start();




        for(;;){
            System.out.println("Hello");
        }

        // Output of upper program is not sequential it will print Hello, then randomly print World or Word@2...

        // This is used to get the current thread name.
        System.out.println(Thread.currentThread().getName());
    }
}
