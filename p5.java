interface Animal{
      void eat();
      void sound();
}

interface TiredAnimal extends Animal{
      void new_mwthod();
}

class Lion implements Animal{
      public void eat(){
            System.out.println("meat");
      }
      public void sound(){
            System.out.println("roar");
      }
}

class Snake implements TiredAnimal{
      public void eat(){
            System.out.println("prey");
      }
      public void sound(){
            System.out.println("hiss");
      }
      public void new_mwthod(){
            System.out.println("3rd method");
      }
}

public class p5 {
      public static void main(String[] args) {
            Lion l=new Lion();
            Snake s=new Snake();
            l.eat();
            l.sound();
            s.eat();
            s.sound();
            s.new_mwthod();
      }
}
