package ClassesForThreads;

public class ShopLifter implements Runnable{
    Store store ;

    public ShopLifter (Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for(int counter = 0; counter< 5; counter++){
            store.steal();
        }
    }
}
