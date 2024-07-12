// public class inheritance {
//     class base{
//         int id;
//         String name;
//         void print(){
//             System.out.println(id);
//             System.out.println(name);
//         }
//     }

//     class derived extends base{
//         int roll;
//         void get(){
//             System.out.println(roll);
//         }
//     }
    
//     public static void main(String[] args) {
//         derived d=new derived();
//         d.id=2;
//         d.name="aashi";
//         d.roll=1;
//         d.get();
//     }
    
// }



//addition of 3 numbers
// class sum2{
//     int a=1;
//     int b=2;
    
//     int add2(){
//         return a+b;
//     }
// }

// class sum3 extends sum2{
//     int c=3;

//     int add3(){
//         return a+b+c;
//     }
// }

// class inheritance{
//     public static void main(String[] args) {
//         sum3 s3=new sum3();
//         System.out.println(s3.add3());
//     }
// }



//super and this keyword
class A{
    int roll=4;
}

class B extends A{
    int roll=5;
    void display(){
        System.out.println(this.roll);
        System.out.println(super.roll);
    }
}

class inheritance{
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}