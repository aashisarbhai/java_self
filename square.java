public class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perim(){
        return 4*side;
    }
    public static void main(String args[]){
        square s=new square();
        s.side=4;
        System.out.println(s.area());
        System.out.println(s.perim());

    }
}