

abstract class Doctor{
    public String name;
    public Doctor(String name)
    {
        this.name=name;
    }

    abstract void operationundergoing();
}

class Doc1 extends Doctor{
    Doc1 (String name){
        super(name);
    }

    void operationundergoing()
    {
        System.out.println("hello i am doing 01 operation "+name);
    }
    
}

class Doc2 extends Doctor{
    Doc2(String name)
    {
        super(name);
    }
    void operationundergoing()
    {
        
        System.out.println("hello i am doing 02 operation "+name);
    }
    
}


  

public class prj_01 {
    public static void main(String[] args) {
       Doctor d1=new Doc1("Raj");
       Doctor d2=new Doc2("Ram");
       d1.operationundergoing();
       d2.operationundergoing();
    }
}
