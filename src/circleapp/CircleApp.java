/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circleapp;


public class CircleApp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Circle Tester");
        while (true)
        {       
            double radius = Validation.getDouble("\nEnter radius: ", 0.0, 1000000000000.0);
            Circle myCircle = new Circle(radius);
            System.out.println("Circumference: " + myCircle.getFormattedCircumference());
            System.out.println("Area:          " + myCircle.getFormattedArea());
            
            if (Validation.getContinue("\nContinue? (y/n): ") == false)
            {
                System.out.println("\nGoodbye. You created " + Circle.getObjectCount() + " Circle object(s).");
                break;
            }
        }
        System.out.println("DONE");
    }
}
