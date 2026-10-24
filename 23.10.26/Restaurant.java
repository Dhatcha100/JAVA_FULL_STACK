class Main {
    public static void main(String[] args) {
        burgerKing b=new burgerKing();
        pizzaHut p=new pizzaHut();

        b.displayMenu();
        p.displayMenu();
    }
}

abstract class restaurant 
    {
        abstract void displayMenu();
        abstract int calculate();
    }

class burgerKing extends restaurant 
    {
        void displayMenu()
        {System.out.println("burger\ndouble sized burger\njumbo burger");}
        int calculate()
        {
            System.out.println("bill"+500);
            return 0;
        }
    }


class pizzaHut extends restaurant 
    {
        void displayMenu()
        {System.out.println("normal\ndouble sized\n cheese blast");}
        int calculate()
        {
            System.out.println("bill"+5000);
            return 0;
        }
    }
