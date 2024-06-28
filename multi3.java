package CoreJavaQuickRevision;

public class multi3 extends Thread{

    private static int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; ++i) {
            increment();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(count);
    }

    public synchronized void increment() {
        ++count;
    }
}
