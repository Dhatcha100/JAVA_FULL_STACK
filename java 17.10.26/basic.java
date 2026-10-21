import java.util.*;

class own
  {
    static void calculate()
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter two numbers two perform arithemetic operations");
      int n1=scan.nextInt();
      int n2=scan.nextInt();
      System.out.println("Sum :"+(n1+n2));
      System.out.println("Difference :"+(n1-n2));
      System.out.println("Product :"+(n1*n2));
      System.out.println("Quotient :"+(n1/n2));
      System.out.println("Reminder :"+(n1%n2));
    }

    static void relation()
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter two numbers two perform comparational operations");
      int n1=scan.nextInt();
      int n2=scan.nextInt();
      System.out.println(n1+">"+n2+" :"+(n1>n2));
      System.out.println(n1+"<"+n2+" :"+(n1<n2));
      System.out.println(n1+"=="+n2+" :"+(n1==n2));
      System.out.println(n1+"!="+n2+" :"+(n1!=n2));
    }

    static void logical()
    {
       Scanner scan=new Scanner(System.in);
      System.out.println("enter age and mark for checking eligblity");
      int age=scan.nextInt();
      int mark=scan.nextInt();
      boolean result=(age>=18 && mark>=50)?true:false;
      System.out.println(result);
    }

    static void bank_balance()
    {
      Scanner scan=new Scanner(System.in);

      int balance=5000;
      System.out.println("intial balance :"+balance);
      System.out.println("enter the depasit amount");
      balance+=scan.nextInt();
      System.out.println("after deposit :"+balance);
      System.out.println("enter the widthdrawal amount");
      balance-=scan.nextInt();
      System.out.println("after widthdrawal :"+balance);
    }

    public static void main(String [] args)
    {
      
    calculate();
    relation();
    logical();
    bank_balance();
    }
  }
