package Threads;

public class ThreadExample extends Thread {

    public volatile int id;

    public ThreadExample(int re) {
        this.id = re;
    }

    @Override
    public void run() {
        try {
            init();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void init() throws InterruptedException {
        for (int i = 0; i < 9; i++) {

            System.out.println(id + i);
            sleep(1000);

        }
    }

    public void destroy() {
        System.out.println("Thread was destroyed");
    }

}
