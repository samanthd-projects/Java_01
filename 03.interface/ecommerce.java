
   interface Payment {
    int time=6;
    void Paypal(int amount);
}

 interface Tax  {
    void Upi(int amount,int tax);
}
class Paypalpayment implements Payment,Tax{
     public void Paypal(int amount)
    {
        System.out.println("Amount * Paypal : "+amount+"  the time is "+Payment.time);
    }
    public void Upi(int amount,int tax)
    {
        System.out.println("Amount of Upi :"+(amount-tax));
    }
}

public class ecommerce {
    public static void main(String[] args) {
        Payment p1=new Paypalpayment();
        p1.Paypal(1400);
        Tax p2=new Paypalpayment();
        p2.Upi(1200,300);
    }
}
