//Exception handling is used to handle the run time errors with the help of try catch and throw blocks
//errors cant be handled but exception can be handed
//runtime is unchecked
//if try block has a exception it directly goes to catch block **then it skips the rest of the try block and executes next block
//exception e must be out at last bcz of none of them worked it would execute if u put at first remaining will just be wasted 
package Exception;


public class exp {
    public static void main(String[] args) {
        int arr[]={2,3,4};
        int arr1[]=new int[3];

        int i=4;
        int j=0;
       
        try{
            int f=arr[0]/0;
            int l=arr[5];
            int k=arr[6];
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array out of bound exc ");
        }

        catch(Exception e)
        {
            System.out.println("exception e ot");
        }

        try{
            int m=i/j;
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception has occured");
        }
        

        System.out.println("After exception");
    }
}
