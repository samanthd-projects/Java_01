
class A{
    void print(){
        System.out.println("Inside A");
    }
    class B{
        void print()
        {
            System.out.println("Inside B of A");
        }
    }
}
public class Inner {
    public static void main(String[] args) {
        A obj=new A();
        A.B ob=obj.new B();
        ob.print();
        obj.print();
    }
}
