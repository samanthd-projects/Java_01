abstract class Employee{
    String name;
    int id;
    int salary;

    Employee(String name,int id,int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    abstract void displaydetails();
    void DisplayEmployeedetails()
    {
        System.out.println("Salary : "+salary);
    }
}

class Emp1 extends Employee{
    Emp1(String name,int id,int salary)
    {
        super(name,id,salary);
    }

    void displaydetails()
    {
        System.out.println("emp1 : Employee details : "+name+"... "+id);
        DisplayEmployeedetails();
    }
   
}


class Emp2 extends Employee{
    Emp2(String name,int id,int salary)
    {
        super(name,id,salary);

    }

    void displaydetails()
    {
        System.out.println("emp1 : Employee details : "+name+"... "+id);
        DisplayEmployeedetails();
    }
   
}

public class Vehicle {
    public static void main(String[] args) {
        Employee e1=new Emp1("Raj",101,500);
        Employee e2=new Emp2("Sam",102,800);
        e1.displaydetails();
        e2.displaydetails();

    }
}
