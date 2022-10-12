import java.util.Scanner;

class DemonetisationException extends Exception {
      int amount;
      DemonetisationException(int amount){
            this.amount=amount;
      }
      public String toString(){
            return ("deposit of Rs."+amount+" exceeds 5000");
      }
}

class Account{
      int balance;
      String type;
      Account(){
            balance=500;
      }
      Account(int balance){
            this.balance=balance;
      }
      void deposit(int amount, String type){
            try{
            if(amount>5000){
                  if(type=="old"){
                        throw new DemonetisationException(amount);
                  }
                  else{
                        balance=balance+amount;
                  }
            }
            else{
                  balance=balance+amount;
            }
             }
            catch(DemonetisationException e){
                  System.out.println(e);
            }
            
      }
      int currBalance(){
            System.out.println(balance);
            return balance;
      }
      void withdraw(int amount){
            if(balance-amount<500){
                  System.out.println("cannot withdraw < 500");
            }
            else{
                  balance=balance-amount;
                  System.out.println("balance: "+balance);
            }
      }
}

public class p6 {
      public static void main(String[] args) {
            int balance,ch;
            Scanner s=new Scanner(System.in);
            System.out.println("creating account..");
            System.out.println("enter initial balance");
            balance=s.nextInt();
            Account a=new Account(balance);
            System.out.println("1. deposit 2.withdraw 3.checkBal");
            
            int amount;
            String type;
            while(true){
                  ch=s.nextInt();
            switch(ch){
                  case 1:System.out.println("enter amt and type");
                  amount=s.nextInt();
                  type=s.next();
                  a.deposit(amount, type);
                  break;
                  case 2:System.out.println("enter amt");
                  amount=s.nextInt();
                  a.withdraw(amount);
                  break;
                  case 3:a.currBalance();
                  break;
                  default:break;
            }
            }
           
      }
}
