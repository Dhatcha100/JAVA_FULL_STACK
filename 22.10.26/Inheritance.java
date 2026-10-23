import java.util.*;
class Employee
  { 
    int employee_id=0;
    String employee_name="";
    int basic_salary=0;
    employee(int id,String name,int salary)
    {
      employee_id=id;
      employee_name=name;
      basic_salary=salary;
    }
  }

  class Permenent extends Employee
    {
      void calculate()
      {
        int salary=Employee.basic_salary/5;
        System.out.println("Name :"+Employee.employee_name+"/nEmployee Id :"+Employee.employee_id+"\nsalary :"+salary);
      }
    }
class Contract extends Employee
    {
      void calculate()
      {
        int salary=Employee.basic_salary+200;
        System.out.println("Name :"+Employee.employee_name+"/nEmployee Id :"+Employee.employee_id+"\nsalary :"+salary);
      }
    }

class Main
  {
    public static void main(String [] Args) 
    {
      Employee harish=new Employee(345,"harish",7000);
      Scanner scan=new Scanner(System.in);
      System.out.pritln("enter a value 1 for permanent 2 for contract");
      int ch=scan.nextInt();
      if (ch==1)
      {
        permenent p= new permenet();
        p.calculate
      }
      else
      {
        contract c= new contract();
        c.calculate();
      }
    }
  }
