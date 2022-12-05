package ClassesForThreads;

public class Policeman implements Runnable {
    Store store;
    public Policeman(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        for (int counter =0 ; counter<5; counter++) {
            store.returnProduct();
        }
    }
}
