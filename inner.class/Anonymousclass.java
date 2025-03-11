

//Anonymous inner classs overriding the show method
    class A {
        public void show() {
            System.out.println("in A Show");        
        }

        public void zeel()
        {
            System.out.println("Thala son ");
        }
    }
    
    public class Anonymousclass {
        public static void main(String a[]) {
            A obj = new A() {
                public void show() {
                    System.out.println("in new Show");

                }
                public void zeel()
                {
                    System.out.println("Zeel is new thala");
                }
            };

            obj.show();
            obj.zeel();
            
            
        
        }
    
}
