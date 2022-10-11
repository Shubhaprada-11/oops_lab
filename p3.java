import java.util.Scanner;

class Circle{
      double radius;
      String color;
      Circle(){
            radius=2;
            color="yellow";
      }
      Circle(double radius){
            this.radius=radius;
      }
      Circle(double radius, String color){
            this.radius=radius;
            this.color=color;
      }
      double getRadius() {
            return radius;
      }
      double getArea(){
            return 3.14*radius*radius;
      }
}

class Cylinder extends Circle{
      double height;
      Cylinder(){
            radius=2;
            height=3;
            color="yellow";
      }
      Cylinder(double height, double radius){
            this.height=height;
            this.radius=radius;
      }
      Cylinder(double height, double radius, String color){
            this.height=height;
            this.radius=radius;
            this.color=color;
      }
      public double getHeight(){
            return height;
      }
      public double getVolume(){
            return 3.14*radius*radius*height;
      }
      public double getArea(){
            return 2*3.14*radius*height;
      }
}

public class p3 {
      public static void main(String[] args) {
            Cylinder c1,c2;
            Scanner s=new Scanner(System.in);
            System.out.println("enter r,h, color of c1");
            double r,h;
            String c;
            r=s.nextInt();
            h=s.nextInt();
            c=s.nextLine();
            c1=new Cylinder(h,r,c);
            System.out.println("enter r,h, color of c2");
            r=s.nextInt();
            h=s.nextInt();
            c=s.nextLine();
            c2=new Cylinder(h,r,c);
            if(c1.getArea()==c2.getArea()){
                  if(c1.getVolume()==c2.getVolume()){
                        if(c1.color.equals(c2.color)){
                              System.out.println("similar");
                        }
                        else{
                              System.out.println("not similar");
                        }
                  }
                  else{
                        System.out.println("not similar");
                  }
            }
            else{
                        System.out.println("not similar");
                  }
            s.close();
      }

      
}
