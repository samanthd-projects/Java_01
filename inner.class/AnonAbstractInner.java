abstract class A{
   abstract void show();
}





class AnonAbstractInner{
    public static void main(String[] args) {
        A obj=new A()
        {
            void show()
            {
                System.out.println("Anon inner class");
            }
        };

        obj.show();
    }
}