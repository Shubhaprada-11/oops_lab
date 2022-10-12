import java.util.Scanner;

interface PerformOperation{
      boolean operation(int x);
}

public class p8 {
      public static void main(String[] args) {
            PerformOperation isOdd= (int n)->{
                  return n%2!=0;
            };
            PerformOperation isPrime= (int n)->{
                  int i;
                  for(i=n/2;i>1;i--){
                        if(n%i==0) return false;
                  }
                  return true;
            };
            PerformOperation isPalindrome= (int n)->{
                  int a,t;
                  a=0;
                  t=n;
                  while(t>0){
                        a*=10;
                        a+=t%10;
                        t=t/10;
                  }
                  return n==a;
            };
            Scanner s=new Scanner(System.in);
            int ch,n;
            Boolean res;
            System.out.println("1.isOdd 2.isPrime 3.isPal");
            while(true){
                  ch=s.nextInt();
                  switch(ch){
                        case 1: n=s.nextInt();
                        res=isOdd.operation(n);
                        System.out.println(res);
                        break;
                        case 2: n=s.nextInt();
                        res=isPrime.operation(n);
                        System.out.println(res);
                        break;
                        case 3: n=s.nextInt();
                        res=isPalindrome.operation(n);
                        System.out.println(res);
                        break;
                  }
            }
      }
}
