
package circleapp;

/**
 *
 * @author wilcoxp3
 * The Circle class is used to create objects representing circles. With fields
 * radius, circumference, and area to define the circle. The static field
 * objectCount keeps a count of how many Circle objects have been created. The
 * class also contains getters for radius, circumference, area, and objectCount,
 * as well as getters for circumference and area which format the number as a
 * string with only one digit after the decimal.
 */
import java.text.NumberFormat;
public class Circle
{
    //fields for the circle's radius, circumference, and area
    private final double radius;
    private final double circumference;
    private final double area;
    
    //static field to keep track of how many circle objects have been created
    private static int objectCount = 0;
    
    //constructor for circle which accepts the radius and calculates the
    //circumference and area using appropriate formulas, then increments
    //objectCount
    public Circle(double radius)
    {
        this.radius = radius;
        circumference = 2 * Math.PI * this.radius;
        area = Math.PI * Math.pow(this.radius, 2);
        objectCount++;
    }
    
    //getter for circumference
    public double getCircumference()
    {
        return circumference;
    }
    
    //getter for the formatted circumference
    public String getFormattedCircumference()
    {
        return formatNumber(circumference);
    }
    
    //getter for area
    public double getArea()
    {
        return area;
    }
    
    //getter for the formatted area
    public String getFormattedArea()
    {
        return formatNumber(area);
    }
    
    //formats a double as a String with 1 place after the decimal
    private String formatNumber(double unformattedNumber)
    {
        NumberFormat formattedNumber = NumberFormat.getNumberInstance();
        formattedNumber.setMaximumFractionDigits(1);
        return formattedNumber.format(unformattedNumber);
    }
    
    //getter for objectCount
    public static int getObjectCount()
    {
        return objectCount;
    }
}