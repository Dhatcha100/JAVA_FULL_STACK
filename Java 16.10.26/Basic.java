package basic;

class Number
  {
    public void print_num(int limit)
    {
      for(int i=1;i<=limit;i++)
        {
          System.out.println(i);
        }
    }
  }

class count {
    void count(long num)
    {
        int count=0;
        for (num=num;num>0;num/=10)
            {
                count++;
            }
        System.out.println(count);
    }
}

class vote
    {
        void check(int age)
        {   
            if(age<18)
            {
                System.out.println("Not elidgble for vote");
            }
            else if(age<121)
            {
                System.out.println("You can vote");
            }
        }
    }


class Even
    {
        void even(int limit)
        {   
            for(int i=0;i<=limit;i+=2)
                {
                    System.out.println(i);
                }
        }
    }

class for_loop
    {
        void use(int limit)
        {
            for(int i=0;i<=limit;i++)
                {
                    System.out.println(i);
                }
        }
    }

class positive
    {
        void check(int num)
        {
            if(num==0)
            {
               System.out.println("that is zero"); 
            }
           else if(num>0)
           {
               System.out.println(num+"this number is positive");
           }
           else
           {
               System.out.println(num+"this number is negetive");
           }
        }
    }

class Divide
    {
        void div(int value,int division)
        {
            System.out.println(value%division==0?value+" this number is divisible by this "+division+" number":value+" this number is not divisible by this "+division+" number");
        }
    }

class SWITCH
    {
        void find(int a,int b,char operator)
        {
         switch(operator)
             {
                 case '+':
                     {
                         System.out.println("Addition"+(a+b));
                         break;
                     }
                 case '-':
                     {
                         System.out.println("Subtract"+(a-b));
                         break;
                     }
                case '*':
                     {
                         System.out.println("Multiplication"+(a*b));
                         break;
                     }
                case '/':
                     {
                         System.out.println("Division"+(a/b));
                         break;
                     }
                case '%':
                     {
                         System.out.println("Modulas"+(a%b));
                         break;
                     }
               default :
                     {
                         System.out.println("Invalid operator");
                     }
             }
        }
    }


