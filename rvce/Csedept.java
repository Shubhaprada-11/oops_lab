package rvce;
import cse.ThirdSem;

class cse extends ThirdSem{
      //override the pblic method
      public void welcomeMsgPublic(){
            System.out.println("overriden public");
      }
      //override private method 
      private void welcomeMsgPriv(){
      System.out.println("overriden private");
     } 
     protected void welcomeMsgProt(){
      System.out.println("Protected override");
     } 
     void welcomeMsg(){
      System.out.println("override default");
     }
     void accessingPriv(){
      System.out.println("to access priv..");
      welcomeMsgPriv();
     }
}

public class Csedept{
      public static void main(String[] args) {
            ThirdSem t= new ThirdSem();
            t.welcomeMsgPublic();
            cse c=new cse();
            c.welcomeMsg();
            c.welcomeMsgPublic();
            c.welcomeMsgProt();
            c.accessingPriv();
      }
}