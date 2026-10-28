// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args)
    {
        try{
            String name="null";
        System.out.println(name.length());

            try {
                System.out.println(100/0);
            }
            catch(Exception e)
                {
                    System.out.println(e);
                }
        }
        catch(Exception e)
            {
                System.out.println(e);
            }
        System.out.println("this works fine");
    }
}
