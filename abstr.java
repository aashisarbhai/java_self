// abstract class vehicle{
//     abstract void run(){
//         System.out.println("vehicle runs");
//      }
// }
// class bike extends vehicle{
//     void run(){
//         System.out.println("bike is running");
//     }
// }
// public class abstr {
//     public static void main(String[] args) {
//         bike b= new bike();
//         b.run();
//     }
    
// }



//having constructors
abstract class bike{
    bike(){
        System.out.println("bike is running");
    }
    abstract void run();
    void GearChanged(){
        System.out.println("gear is changed");
    }
}

class honda extends bike{
    void run(){
        System.out.println("honda is a good bike");
    }
}

class abstr{
    public static void main(String[] args) {
        honda h=new honda();
        h.run();
        h.GearChanged();
    }
}