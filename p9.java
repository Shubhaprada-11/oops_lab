import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p9 {
     public static void main(String[] args) {
      ArrayList<String> colors=new ArrayList<>();
      ArrayList<String> rev=new ArrayList<>();
      System.out.println("1. add 2. copy to array 3. reverse 4. sublist 5. sort 6. clone");
      int ch,start,end;
      String color;
      Scanner s=new Scanner(System.in);
      while(true){
            ch=s.nextInt();
            switch(ch){
                  case 1: 
                  System.out.println("enter color");
                  color=s.next();
                  colors.add(color);
                  System.out.println(colors);
                  break;
                  case 2: if(colors.size()==0){
                        System.out.println("empty");
                        break;
                  }
                  String[] arr=new String[colors.size()];
                  colors.toArray(arr);
                  for(String str:arr)
                        System.out.println(str);
                  break;
                  case 3: for(int i=colors.size()-1;i>=0;i--){
                        rev.add(colors.get(i));
                  }
                  for(int i=0;i<colors.size();i++){
                        System.out.println(rev.get(i));
                  }
                  break;
                  case 4: start=s.nextInt();
                  end=s.nextInt();
                  if(start<0 || end>colors.size()){
                        System.out.println("invalid indices");
                        break;
                  }
                  ArrayList<String> sub=new ArrayList<>(colors.subList(start, end));
                  System.out.println(sub);
                  break;
                  case 5: Collections.sort(colors);
                  System.out.println(colors);
                  break;
                  case 6:
                  @SuppressWarnings("unchecked")
                  ArrayList<String> cl=(ArrayList<String>)colors.clone();
                  System.out.println(cl);
                  break;
            }
      }
     } 
}
