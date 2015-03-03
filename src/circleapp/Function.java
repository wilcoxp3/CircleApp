/**
 * The Function class contains the static method findGCD, which returns the
 * greatest common divisor of two numbers through a recursively defined version
 * of the Euclidean Algorithm. It also contains the static method getRandIntRange,
 * which returns a random integer within a specified range.
 */

package circleapp;

public class Function
{
    /**
     * findGCD finds the greatest common divisor of two integers
     * @param number1
     * @param number2
     * @return 
     */
    public static int findGCD(int number1, int number2)
    {
        if (number2 == 0)
        {
            //The absolute value is returned to allow the algorithm to accept
            //negative numbers as input and still return a valid GCD.
            return Math.abs(number1);
        }
        else
        {
            return findGCD(number2, number1 % number2);
        }
    }
    
    /**
     * getRandRange retrieves a random integer within a specified range
     * @param min
     * @param max
     * @return
     */
    
    public static int getRandIntRange(int min, int max)
    {
        int randInt = min + (int) (Math.random() * ((max - min) + 1));
        return randInt;
    }
}