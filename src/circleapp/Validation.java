/**
 * The Validation class contains three static methods for input validation.
 * The getInt method receives a valid integer from the user. An overloaded version
 * of getInt also accepts a minimum and maximum allowed value for the integer.
 * The getContinue method returns a Boolean indicating the user's choice to 
 * continue or quit.
 */

package circleapp;
import java.util.Scanner;
public class Validation
{
    /**getInt
     * prompts user to enter an integer
     * returns a valid integer
     * @param prompt
     * @return 
     */ 
    public static int getInt(String prompt)
    {
        //create new Scanner object and declare and initialize user choice to 0
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        //loop until user enters a valid int
        while (true)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                break;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }
    
    /**
     * overloaded getInt to accept minimum and maximum values 
     * @param prompt
     * @param min
     * @param max
     * @return
     */
    public static int getInt(String prompt, int min, int max)
    {
        while (true)
        {
            int i = getInt(prompt);
            if (i < min)
            {
                System.out.println("Error! Integer must be from " + min + " to " + max);
            }
            else if (i > max)
            {
                System.out.println("Error! Integer must be from " + min + " to " + max);
            }
            else
            {
                return i;
            }
        }
    }
    /** getDouble
     * prompts user to enter a valid double
     * @param prompt
     * @return
     */
    public static double getDouble(String prompt)
    {
        
    }
    /**
     * getDouble
     * overloaded getDouble which accepts minimum and maximum values
     * @param prompt
     * @param min
     * @param max
     * @return
     */
    public static double getDouble(String prompt, double min, double max)
    {
        
    }
    
    /**
     * getContinue
     * prompts the user to continue by entering 'y' or 'n'
     * returns boolean true or false corresponding to yes or no respectively
     * @param prompt
     * @return
     */
    public static boolean getContinue(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        boolean answer;
        String choice = sc.next();
        
        while(true)
        {
            if (choice.equalsIgnoreCase("y"))
            {
                answer = true;
                break;
            }
            else if (choice.equalsIgnoreCase("n"))
            {
                answer = false;
                break;
            }   
            else
            {
                System.out.print("Invalid choice. Please choose 'Y' or 'N': ");
                sc.nextLine();
                choice = sc.next();
            }
        }
        return answer;
    }
}