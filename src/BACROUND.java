public class BACROUND  extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
