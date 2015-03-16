
/**
* Project 7-2: Circle
* Professor: Tedd Sperling
* Course: Introduction to JAVA - (22150)
* Student: Paul Wilcox
* This program prompts the user to enter the radius of a circle, creates a Circle
* object which calculates the circumference and area of the circle using that radius.
* It then prints the circumference and area before prompting the user to continue
* or quit. Upon quitting, it displays the total number of Circle objects created.
*/

package circleapp;


public class CircleApp
{
    public static void main(String[] args)
    {
        //Print opening message and enter main program loop.
        System.out.println("Welcome to the Circle Tester");
        while (true)
        {
            //Get from the user a valid double within a reasonable range.
            double radius = Math.abs(Validation.getDouble("\nEnter radius: "));
            
            //Create Circle object myCircle
            Circle myCircle = new Circle(radius);
            
            //Print the circumference and area of the circle.
            System.out.println("Circumference: " + myCircle.getFormattedCircumference());
            System.out.println("Area:          " + myCircle.getFormattedArea());
            
            //Prompt user to continue or quit, and display total circle objects
            //created upon quitting.
            if (Validation.getContinue("\nContinue? (y/n): ") == false)
            {
                System.out.println("\nGoodbye. You created " + Circle.getObjectCount() + " Circle object(s).");
                break;
            }
        }
        System.out.println("DONE");
    }
}