import java.util.Scanner;

public class p10 {
      public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String sentence,joint;
            int ch;
            String[] words;
            System.out.println("1. penultimate 2. replace 3. split");
            while(true){
                  System.out.println("enter sentence");
                  sentence=s.nextLine();
                  ch=s.nextInt();
                  switch(ch){
                        case 1: words=sentence.split(" ");
                        System.out.println("penultimate word: "+words[words.length-2]);
                        break;
                        case 2: words=sentence.split(" ");
                        for(int i=0;i<words.length;i++){
                              if(words[i].toLowerCase().equals("java"))
                                    words[i]="python";
                              else if(words[i].toLowerCase().equals("python"))
                                    words[i]="java";
                        }
                        for(int i=0;i<words.length;i++)
                              System.out.print(words[i]+" ");
                        break;
                        case 3: System.out.print("where to split");
                        joint=s.nextLine();
                        words=sentence.split(joint);
                        for(int i=0;i<words.length;i++)
                              System.out.print(words[i]+" ");
                        break;
                  }
            }
      }
}
