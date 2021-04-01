import java.util.*;
public class Fuel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double fuel,dist;
        System.out.println("Enter the no of liters to fill the tank");
        fuel=sc.nextDouble();
        if(fuel<1)
        {
            System.out.println(String.format("%.0f",fuel)+" is an Invalid Input");
        }
        else
        {
            System.out.println("Enter the distance covered");
            dist=sc.nextDouble();
            
            if(dist<1)
            {
                System.out.println(String.format("%.0f",dist)+" is an Invalid Input");
            }
            else
            {
                double l=(fuel/dist)*100;
                System.out.println("Liters/100KM");
                System.out.println(String.format("%.2f", l));
                double m=(dist*0.6214)/(fuel*0.2642);
                System.out.println("Miles/gallons");
                System.out.println(String.format("%.2f", m));
            }
        }
    }
}