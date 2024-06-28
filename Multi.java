package CoreJavaQuickRevision;

public class Multi extends Thread{
    private int count = 0;
    @Override
    public void run() {
        for(int i = 1; i <= 10; ++i) {
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void increment() {
        ++count;
    }
}
