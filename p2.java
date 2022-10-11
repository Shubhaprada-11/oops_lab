import java.util.Scanner;

class Addr{
      String StreetNum;
      String state;
      String city;
      String country;   
      Addr(String StreetNum, String city,String state,String country){
            this.StreetNum=StreetNum;
            this.city=city;
            this.state=state;
            this.country=country;
      }
      void display(){
            System.out.println("streetnum: "+StreetNum+" city: "+city+" state: "+state+" country: "+country);
      }
}

class Student{
      String usn;
      String name;
      Addr addr;
      Student(String usn, String name, Addr addr){
            this.addr=addr;
            this.name=name;
            this.usn=usn;
      }
}

class College{
      String name;
      Addr addr;
      College(String name, Addr addr){
            this.addr=addr;
            this.name=name;
      }
}

class Employee{
      String EmpID;
      String name;
      Addr addr;
      Employee(String EmpID, String name, Addr addr){
            this.addr=addr;
            this.name=name;
            this.EmpID=EmpID;
      }
}

public class p2 {
      public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n;
            System.out.println("enter n");
            n=s.nextInt();
            Student stu[]=new Student[20];
            College clg[]=new College[20];
            Addr address[]=new Addr[20];
            Employee emp[]=new Employee[20];
            String stnum, state,city,country,usn,name,empid;
            for(int i=0;i<n;i++){
                  System.out.println("student:enter address");
                  stnum=s.nextLine();
                  city=s.nextLine();
                  state=s.nextLine();
                  country=s.nextLine();
                  address[i]=new Addr(stnum, city, state, country);
                  System.out.println("enter usn, name");
                  usn=s.nextLine();
                  name=s.nextLine();
                  stu[i]=new Student(usn, name, address[i]);
                  System.out.println("student deatils");
                  System.out.print("name: "+name+" usn: "+usn+" addr: ");
                  address[i].display();
                  System.out.println("college :enter address");
                  stnum=s.nextLine();
                  city=s.nextLine();
                  state=s.nextLine();
                  country=s.nextLine();
                  address[i]=new Addr(stnum, city, state, country);
                  System.out.println("enter name");
                  name=s.nextLine();
                  clg[i]=new College(name, address[i]);
                  System.out.println("student deatils");
                  System.out.print("name: "+name+" addr: ");
                  address[i].display();
                  System.out.println("employee:enter address");
                  stnum=s.nextLine();
                  city=s.nextLine();
                  state=s.nextLine();
                  country=s.nextLine();
                  address[i]=new Addr(stnum, city, state, country);
                  System.out.println("enter empid, name");
                  empid=s.nextLine();
                  name=s.nextLine();
                  emp[i]=new Employee(empid, name, address[i]);
                  System.out.println("student deatils");
                  System.out.print("name: "+name+" id: "+empid+" addr: ");
                  address[i].display();
            }
            s.close();
      }
}
