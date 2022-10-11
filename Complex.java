import java.util.*;

class complex{
      int real;
      int imag;
      complex(){
            real=1;
            imag=1;
      }
      complex(int real,int imag){
            this.real=real;
            this.imag=imag;
      }
      complex add(complex c){
            complex res=new complex((this.real+c.real),(this.imag+c.imag));
            return res;
      }
      complex add(complex c1, complex c2){
            complex res=new complex(c1.real+c2.real, c1.imag+c2.imag);
            return res;
      }
      complex sub(complex c){
            complex res=new complex((this.real-c.real),(this.imag-c.imag));
            return res;
      }
      void display(){
            System.out.println("real: "+real);
            System.out.println("imag: "+imag);
            System.out.println("num: "+real+"+i"+imag);
      }
}
public class Complex {
      public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter real part and imag part of complex number");
            int r,i;
            r=s.nextInt();
            i=s.nextInt();
            complex c= new complex(r, i);
            c.display();
            System.out.println("menu choose: 1. add 2. subtract 3. display");
            int ch;
            ch=s.nextInt();
            int a,b;
            complex c1,res;
            switch(ch){
                  case 1:
                        System.out.println("enter complex number to add");
                        a=s.nextInt();
                        b=s.nextInt();
                        c1=new complex(a, b);
                        res=c.add(c1);
                        res   .display();
                        break;
                  case 2:
                        System.out.println("enter complex number to add");
                        a=s.nextInt();
                        b=s.nextInt();
                        c1=new complex(a, b);
                        res=c.sub(c1);
                        res.display();
                        break;
                  case 3:
                        c.display();
                        break;
                  default: 
                        System.out.println("default");
            }
            s.close();
      }
}
