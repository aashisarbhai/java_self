class base{
    void print(){
        System.out.println("base class");
    }
}

class derived extends base{
    void print(){
        System.out.println("derived class");
    }
}

class derived2 extends derived{
    void print(){
        System.out.println("derived 2 class");
    }
}

class overriding{
    public static void main(String[] args) {
        derived2 d2=new derived2();
        d2.print();
        derived d=new derived();
        d.print();
        base b=new base();
        b.print();

    }
}