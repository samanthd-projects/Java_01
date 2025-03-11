package Basics;
import javax.naming.ldap.Rdn;

abstract class Car{
     abstract void drive();
     abstract void space();

     void car()
     {
        System.out.println("hi");
     }
     
}

class Honda extends Car{
        void drive()
        {
            System.out.println("implemented");
        }
        void space()
        {
            System.out.println("large spacing......");
        }

        void engine()
        {
            System.out.println("nice engine");
        }
}


class Redbull extends Car{

        void drive()
        {
            System.out.println("implemented");
        }
        void space()
        {
            System.out.println("large spacing......");
        }

        void extrawings()
        {
            System.out.println("extra wings");
        }
}




public class Inheritance {
    public static void main(String[] args) {
       Car c=new Redbull();
        c.drive();
        c.space();
        Redbull r = (Redbull) c;  
        r.extrawings(); 

    }
}


