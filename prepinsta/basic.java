package prepinsta;
import java.util.*;

public class basic {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    //    int n=8;
    //    int a=0;
    //    int b=1;
    //    System.out.print(a+" "+b);
    //    for (int i = 2; i <=8; i++) {
    //        int sum=a+b;
    //        System.out.print(" "+sum);
    //        a=b;
    //        b=sum;
    //    }
    // }
    // ____------------------------------------------------_______________--
    // int n=5;
    // System.out.println(factorial(5));
    // }

    // public static int factorial(int n)
    // {
    //     if (n==1) {
    //         return 1;
    //     }

    //     return n*factorial(n-1);
    // }

        // // 
        // System.out.println("Enter the number ");
        // int n=sc.nextInt();
        // int count=0;
        // for (int i = 1; i <= n; i++) {
        //     if (n%i==0) 
        //    System.out.println(i);
        // }
        // if (count>2) {
        //     System.out.println("Not a prime ");
        // }
        // else{
        //     System.out.println("Prime");
        // }

        int n=142;
        int ans=0;
        int temp=n;

        while(temp>0)
        {
            int rem=temp%10;
            int fct=facto(rem);
            ans=ans+fct;
            temp/=10;
        }
        System.out.println(ans);
    }

    public static int facto(int rem)
    {
        if(rem==1)
        return 1;
        return rem*facto(rem-1);
    }
}

