
// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
int[] numbers = {12, 7, 24, 9, 15, 30, 18, 5};
        int find=15,found=-1;
      int odd=0,even=0;
      for( int i=0;i<numbers.length;i++)
        {
          if(numbers[i]%2==0)
          {
            even++;
          }
          else
          {
            odd++;
          }
        }
      System.out.println("\nEven count :"+even+"\nodd count :"+odd);
        for( int i=0;i<numbers.length;i++)
            if(numbers[i]==find)
            {
            found++; System.out.println("that found in"+(i+1));
            }
        else if(found==-1 && i==numbers.length-1)
        {
            System.out.println("not found within the array");
        }
        
    }
}
