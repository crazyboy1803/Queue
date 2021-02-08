import java.util.Scanner;
public class CircularQueueExample 
{
    CircularQueueExample()
    {
        
    }
    void insert()
    {
        
    }
    void delete()
    {
        
    }
    void traverse()
    {
        
    }
    public static void main(String args[])
    {
        CircularQueueExample obj = new CircularQueueExample();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for Exit");
            
            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    
            }
        }
    }
            
}
