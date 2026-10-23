class Main
{
    public static void main(String [] args)
    {
        gpay g=new gpay();
        System.out.println(g.get_holder());

        g.set_holder("Dhatchinamoorthi");
 System.out.println(g.get_holder());   
    }
    
}


class HDFC
  {
    private String holder ="dhatcha";
    private String mail="dhatcha100@gmail.com";
    private long balance=10000;
    private String account_type="savings";

   public void set_holder(String name)
      {
          this.holder=name;
      }

   public   String get_holder()
      {
          return this.holder;
      }
  }

class gpay extends HDFC
  {
    
  } 
