package Enum;



public class Enum {


    public static void main(String[] args) {
        Status s=Status.Bad;
        System.out.println(s);

        Status ss[]=Status.values();
        for (Status status : ss) {
            System.out.println(status+" "+status.ordinal());
        }

        System.out.println("__________01________ ");

        for (Status obj : Status.values()) {
            switch (obj) {
                case Average:
                System.out.println("average switch");
                break;

                case Good:
                System.out.println("good in switch");
                break;

                default:
                System.out.println("Bad in switch");
            }
        }

          System.out.println("__________02_________ ");

          F1 team=F1.redbull;
          System.out.println(team+" == "+team.driver);
         
    }
}


 enum Status{
    Good,Bad,Average
 }

 enum F1{
    redbull("max"),rb("lawson"),ferrari("lewis");

    String driver;
    F1(String name)
    {
        this.driver=name;
    }
 }
