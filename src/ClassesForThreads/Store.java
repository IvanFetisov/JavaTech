package ClassesForThreads;

import java.util.List;

public class Store  {
    private int product;

    public synchronized void returnProduct(){
        while (product >= 10) {
        try {
            wait();
        }catch (InterruptedException e){}
        }
        product ++;
        System.out.println("Полицейский забрал у вора один товар");
        System.out.println("Товаров на складе " + product);
        notify();

    }
    public synchronized void steal(){
        while (product >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
            product --;
            System.out.println("Вор украл один товар");
            System.out.println("Товаров на складе " + product);
            notify();

    }
    public synchronized void get(){
        while(product < 1){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }
        product --;
        System.out.println("Покупатель купил один товар");
        System.out.println("Товаров на складе " + product);
        notify();
    }
    public synchronized void put() {
        while (product>=10) {
          try {
             wait();
          }
          catch (InterruptedException e) {
          }
       }
       product++;
       System.out.println("Производитель добавил 1 товар");
       System.out.println("Товаров на складе: " + product);
       notify();
    }
 }
