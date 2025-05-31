package Exception;
//throw is used to  throw the exception to the catch block
public class exp2 {
    public static void main(String[] args) {
        int i=18;
        int j=2;
        try{
            int ans=i/0;
            ans=9;
            if(ans==9)
            throw new ArrayIndexOutOfBoundsException("Last message");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Catched the exception"+e);
        }

        catch(Exception e)
        {
            System.out.println("Wont be executed");
        }
    }
}
