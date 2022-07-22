//Task 38 : Declare a class name ‘A’ with some methods and one parameterised constructor. Derive another class ‘B’ from ‘class A’. In class B have some methods and parameterized constructor. Derive Class C from class B Demonstrate how base class parameterised constructor gets call from child class constructor in multilevel inheritance

class A{
    int x;
    A(int x)
    {
        this.x=x;
    }
    void dispA()
    {
        System.out.println(x);
    }
}
class B extends A{
    int y;
    B(int x,int y)
    {
        super(x);
        this.y=y;
    }
    void dispB()
    {
        System.out.println(y);
    }

}
class C extends B{
    int z;
    C(int x,int y,int z)
    {
        super(x,y);
        this.z=z;
    }
    void dispC()
    {
        System.out.println(z);
    }
}

public class Task38
{
    public static void main(String[] args)
    {
        C c=new C(10,20,30);
        c.dispA();
        c.dispB();
        c.dispC();
    }
}