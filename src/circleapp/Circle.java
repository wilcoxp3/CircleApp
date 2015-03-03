/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circleapp;

/**
 *
 * @author wilcoxp3
 */
public class Circle
{
    protected double radius;
    protected double circumference;
    protected double area;
    protected static int objectCount = 0;
    
    public Circle(double radius)
    {
        this.radius = radius;
        circumference = 2 * Math.PI * this.radius;
        area = Math.PI * Math.pow(this.radius, 2);
        objectCount++;
    }
    
    public double getCircumference()
    {
        return circumference;
    }
    
    public String getFormattedCircumference()
    {
        return formatNumber(circumference);
    }
    
    public double getArea()
    {
        return area;
    }
    
    public String getFormattedArea()
    {
        return formatNumber(area);
    }
    
    private String formatNumber(double unformattedNumber)
    {
        String formattedNumber = String.format(Double.toString(unformattedNumber), "%.1f");
        return formattedNumber;     
    }
    
    public static int getObjectCount()
    {
        return objectCount;
    }
}
