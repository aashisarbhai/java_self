// interface i1{
//     void print();
// }

// class intrface implements i1{
//     public void print(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         intrface a=new intrface();
//         a.print();
//     }
// }



// interface shape{
//     void draw();
// }

// class circle implements shape{
//     public void draw(){
//         System.out.println("circle is drawn");
//     }
// }

// class intrface implements shape{
//     public void draw(){
//         System.out.println("square is drawn");
//     }
//     public static void main(String[] args) {
//         intrface i=new intrface();
//         i.draw();
//         circle c=new circle();
//         c.draw();
//     }
// }




// //multiple interface
// interface TwoDimensional{
//     public void shape();
// }
// interface ThreeDimensional{
//     public void shape();
// } 

// class circle implements TwoDimensional , ThreeDimensional{
//     public void shape(){
//         System.out.println("shape is drawn");
//     }
// }

// class intrface{
//     public static void main(String[] args) {
//         circle c=new circle();
//         c.shape();
//     }
// }




// //interface inheritance
// interface A{
//     public void print();
// }

// interface B extends A{
//     public void show();
// }

// class intrface implements B{
//     public void print(){
//         System.out.println("hello");
//     }
//     public void show(){
//         System.out.println("hi");
//     }
//     public static void main(String[] args) {
//         intrface i=new intrface();
//         i.print();
//         i.show();
//     }
// }



//default method 
// interface shape{
//     public void draw();
//     default void DispMess(){
//         System.out.println("default method");
//     }
// }

// class rectangle implements shape{
//     public void draw(){
//         System.out.println("square is drawn");
//     }
//     public static void main(String[] args) {
//         rectangle s=new rectangle();
//         s.draw();
//         s.DispMess();
//     }
// }






// //static method in interface
// interface shape{
//     public void draw();
//     static int area(int side){
//         return side*side;
//     }
// }

// class rectangle implements shape{
//     public void draw(){
//         System.out.println("rectangle is drawn");
//     }
// }

// class intrface {
//     public static void main(String[] args) {
//     rectangle r=new rectangle();
//     r.draw();
//     System.out.println(shape.area(5));
// }
// }




// //abstract class implementing interface
// interface i{
//     public void a();
//     public void b();
//     public void c();
//     public void d();
// }

// abstract class A implements i{
//     public void c(){
//         System.out.println("i am in c");
//     }
// }

// class intrface extends A{
//     public void a(){
//         System.out.println("i am in a");
//     }
//     public void b(){
//         System.out.println("i am in b");
//     }
//     public void c(){
//         System.out.println("i am in d");
//     }

//     public void d(){
//         System.out.println("in d");
//     }

//     public static void main(String[] args) {
//         intrface b=new intrface();
//         b.a();
//         b.b();
//         b.c();
//         b.d();
//     }
// }





//multiple inheritance
// class student{
//     int m1;
//     int m2;
//     void getMarks(int a, int b){
//          m1=a;
//          m2=b;
//     }

//     void showMarks(){
//         System.out.println("marks in a" +m1);
//         System.out.println("marks in b" +m2);
//     }
// }

// interface sports{
//     int sportsMarks=6;
//     void sportsMarks();
// }

// class intrface extends student implements sports{
//     public void sportsMarks(){
//         System.out.println("sports marks" +sportsMarks);
//     }

//     void display(){
//         int total;
//         showMarks();
//         sportsMarks();
//         total=m1+m2+sportsMarks;
//         System.out.println("total is" +total);
//     }
//     public static void main(String[] args) {
//         intrface r=new intrface();
//         r.getMarks(67,77);
//         r.display();
//     }
// }
