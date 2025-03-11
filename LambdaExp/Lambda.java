//lamba func are only applicable to functionalInterface i.e 1 abstract func
//denoted by ->
//lambda func is just instantiate the functional interface 
//rather than the class we can use lambda operator

package LambdaExp;
@FunctionalInterface
 interface I {
    public void print();
}

public class Lambda {
    public static void main(String[] args) {
        I obj=()->{
                System.out.println("Inside lambda func");
        };
        
        obj.print();
    }
}   
