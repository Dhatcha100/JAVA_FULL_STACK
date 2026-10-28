// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args)
    {
        try{
            String name=null;
        System.out.println(name);
            System.out.println(100/0);

        }
        catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        catch(NullPointerException e)
            {
                System.out.println(e);
            }
        System.out.println("this works fine");
    }
}
