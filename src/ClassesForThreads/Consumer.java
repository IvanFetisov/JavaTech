package ClassesForThreads;

import ClassesForThreads.Store;

public class Consumer implements Runnable{
      
     Store store;
    public Consumer(Store store){
       this.store=store; 
    }
    public void run(){
        for (int i = 1; i < 3; i++) {
            store.get();

        }
    }
}