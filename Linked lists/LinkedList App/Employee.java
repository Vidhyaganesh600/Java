//import java.lang.*;
public abstract class Employee {
    String name;
    double basic_sal;
    double da;
    double hra;
    double it;
    Employee(String n,double b){
        name=n;
        basic_sal=b;
        da=basic_sal*0.7;
        hra=basic_sal*0.3;
        it=basic_sal*0.4;
    }
    abstract double gross_sal();
}
class Manager extends Employee{
    double inc;
    Manager(String n,double b){
        super(n,b);
    }
    double gross_sal(){
        inc=basic_sal*0.1;
        double gross=basic_sal+da+hra-it+inc;
        System.out.println("Employee name:"+" "+name);
        System.out.println("Designation:Manager");
        System.out.println("basic salary:"+" "+basic_sal);
        System.out.println("dearness allowance"+" "+da);
        System.out.println("House rent allowance"+" "+hra);
        System.out.println("Income tax:"+" "+it);
        System.out.println("Annual increament"+" "+inc);
        return gross;
    }
}
class Technician extends Employee{
    double inc;
    Technician(String n,double b){
        super(n,b);
    }
    double gross_sal(){
        inc=basic_sal*0.15;
        double gross=basic_sal+da+hra-it+inc;
        System.out.println("Employee name:"+" "+name);
        System.out.println("Designation:Technician");
        System.out.println("basic salary:"+" "+basic_sal);
        System.out.println("dearness allowance"+" "+da);
        System.out.println("House rent allowance"+" "+hra);
        System.out.println("Income tax:"+" "+it);
        System.out.println("Annual increament"+" "+inc);
        return gross;
    }
    public static void main(String[] args){
        Manager m=new Manager("Ankush", 5000);
        Technician t1=new Technician("Vignesh", 2500);
        Technician t2=new Technician("Ganesh", 2500);
        Technician t3=new Technician("Vivek", 2000);
        Technician t4=new Technician("suresh", 1500);
        Employee e;
        e=m;
        System.out.println("Gross salary:"+" "+e.gross_sal());
        e=t1;
        System.out.println("Gross salary:"+" "+e.gross_sal());
        e=t2;
        System.out.println("Gross salary:"+" "+e.gross_sal());
        e=t3;
        System.out.println("Gross salary:"+" "+e.gross_sal());
        e=t4;
        System.out.println("Gross salary:"+" "+e.gross_sal());
    }
}