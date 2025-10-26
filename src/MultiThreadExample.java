public class MultiThreadExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
        }
    }
}


class NumberPrinter implements Runnable {
    private int threadNumber;


    public NumberPrinter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        try {

            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread " + threadNumber + " is printing number: " + i + " from the list");
                Thread.sleep(1000); // 暂停1秒
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
