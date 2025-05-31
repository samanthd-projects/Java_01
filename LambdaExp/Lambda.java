//lamba func are only applicable to functionalInterface i.e 1 abstract func and marker + regular 
//denoted by ->
//lambda func is just instantiate the functional interface 
//rather than the class we can use lambda operator

package LambdaExp;
@FunctionalInterface
 interface I {
    public void print(int i);
}

public class Lambda {
    public static void main(String[] args) {
        I obj=(i)->{
                System.out.println("Inside lambda func"+i);
        };
        
        obj.print(7);
    }
}   
