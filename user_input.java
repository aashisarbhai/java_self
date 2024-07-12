import java.util.Scanner;
class user_input {
    //public static void main(String args[]){
    //Scanner s = new Scanner(System.in);
    //System.out.println("enter first number:");
    //int a= s.nextInt();
    //System.out.println("enter secon number:");
    //int b= s.nextInt();
    //int sum= a+b;
    //System.out.println("sum of two numbers is:" +sum);
    
    //String str= s.next();
    //System.out.println(str);

    //public static void main(String[] args) {
      //  Scanner s=new Scanner(System.in);
     //   System.out.println("enter first number");
       // int a=s.nextInt();
       // System.out.println("enter second number");
      //  int b= s.nextInt();
        //System.out.println("enter third number");
     //   int c=s.nextInt();
       // int sum=a+b+c;
      //  System.out.println("sum is:" +sum);
      //  s.close();

    //}

    //write a program to detect whether a number entered by the user is integer or not

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //int a= s.nextInt();
        System.out.println(s.hasNextInt());

        s.close();

    }
    
}
