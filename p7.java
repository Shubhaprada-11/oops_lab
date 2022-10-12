import java.util.LinkedList;
import java.util.Random;

import cse.ThirdSem;

class Market{
      LinkedList<String> l=new LinkedList<>();
      final int capacity=5;
      String[] fruits={"apple","orange","mango","melon"};
      Random r=new Random();
      public void produce() throws InterruptedException{
            while(true){
                  synchronized(this){
                        while(l.size()==capacity)
                              wait();
                        String fruit= fruits[r.nextInt(4)];
                        l.add(fruit);
                        System.out.println("producer produced "+fruit);
                        notifyAll();
                        Thread.sleep(500);
                  }
            }
      }
      public void consume() throws InterruptedException{
            while(true){
                  synchronized(this){
                        while(l.size()==0)
                              wait();
                        String fruit=l.removeFirst();
                        System.out.println(fruit+ " consumed");
                        notifyAll();
                        Thread.sleep(500);
                  }
            }
      }
}

public class p7 {
      public static void main(String[] args) throws InterruptedException {
            Market m=new Market();
            Thread t1=new Thread(new Runnable() {
                  public void run(){
                        try{
                              m.produce();
                        }
                        catch(InterruptedException e){
                              e.printStackTrace();
                        }
                  }
            });
            Thread t2=new Thread(new Runnable(){
                  public void run(){
                        try{
                              m.consume();
                        }
                        catch(InterruptedException e){
                              e.printStackTrace();
                        }
                  }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
      }
}
