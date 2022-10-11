import java.util.Scanner;

class AtRandomNumber
{
    public static void main(String[] args) 
    {
        int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
     
            System.out.println(rand.nextInt(maxRange));
        }
    }
}
