// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
    }
}


class account
    {
        private long account_no=530000;
        private long[] balance=new long[10];
        private int[] accountstype=new int[10];
        private int[] pins=new int[10];
        Private String[] names=new String[10];
        private long[] accounts=new long[10];

        private final void createAcc(int pin,int acc,String name)
        {
            long index=account_no-530000;
            this.accounts[index]=account_no+1;
this.pins[index]=pin;
this.names[index]=name;
this.accountstype[index]=acc;
            
        }

        private final void showaccount(long acc,int pin)
        {
            int accI=0;
            int pinI=0;
            for(int i=0;i<accounts.length;i++)
                {
                    if(accounts[i]==acc)
                    {
                        accI=i;
                        pinI=i;
                        break;
                    }
                    
                }
if(this.accounts[accI]==acc && this.pins[pinI]==pin)
{
    System.out.println("Account no"+this.accounts[accI]);
    System.out.println("Account holder Name"+this.names[accI]);
    System.out.println("Balance"+this.balance[accI]);
    System.out.println("Account type"+(this.accountsType[accI])==1?"savings":"current");
}
                
        }
        
       final int checkacc(long acc,int pin) 
        {
          int accI=0;
            int pinI=0;
            for(int i=0;i<accounts.length;i++)
                {
                    if(accounts[i]==acc)
                    {
                        accI=i;
                        pinI=i;
                        break;
                    }
                    
                }
if(this.accounts[accI]==acc && this.pins[pinI]==pin)
{
    return 1;}
    return 0;
    
    }
    
    final String deposit(long acc,int pin,int amount)
        {
          
          int accI=0;
            int pinI=0;
            for(int i=0;i<accounts.length;i++)
                {
                    if(accounts[i]==acc)
                    {
                        accI=i;
                        pinI=i;
                        break;
                    }
                    
                }  
                this.balance[accI]+=amount;
                return "amount credited Rs "+amount;
        }
    }
    
    class savings extends accounts
        {
            class deposit(long acc,int pin)
        {
            Scanner scan=new Scanner (System.in);
            int check=accounts.checkacc(acc,pin);
            if(check==1)
            {
               System.out.println("enter the amount") ;
            int amount=scan.nextInt();
            if(amount>=500)   
            {        String result= super.deposit(acc,pin,amount);
            System.out.println(result);
                }
                else
            {
                System.out.println("minimum deposit amount atleast 500");
                }
                }
            }
            }
