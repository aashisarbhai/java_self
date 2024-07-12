import java.util.Scanner;

public class student {
    //public static void main(String[] args) {
    //Scanner s=new Scanner(System.in);
    //System.out.println("Enter marks of all 5 subjects");
    //int a=s.nextInt();
    //int b=s.nextInt();
    //int c=s.nextInt();
    //int d=s.nextInt();
    //int e=s.nextInt();
    //int percent=(a+b+c+d+e)/5;
    //System.out.println("total percentage obtained is" +percent);
    //s.close();


   //write a program to ask user to enter his name and then greet with hello <name> have a good day
   //public static void main(String[] args) {
    //Scanner s=new Scanner(System.in);
    //System.out.println("Enter your name");
    //String str=s.next();
    //System.out.println("hello" +str+ "have a good day");
    //s.close();
   //}


   //write a program to convert kilometers into meters
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter kilometers");
    int km=s.nextInt();
    int m=km*1000;
    System.out.println("in meters it will be" +m);
    s.close();
   }
}
