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
            int index=account_no-530000;
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
if(accounts[accI]==acc && pins[pinI]==pin)
{
    System.out.println
}
                
        }
    }
