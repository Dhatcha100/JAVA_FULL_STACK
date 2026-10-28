class Main {
    public static void main(String[] args)
    {
        try{
            String name="abc";
        System.out.println(Integer.valueOf(name));
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
        catch(Exception e)
            {
                System.out.println(e);
            }
        System.out.println("this works fine");
    }
}
