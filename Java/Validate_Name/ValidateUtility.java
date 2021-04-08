package Validate_Name;
import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String product=sc.nextLine();
        Validate v=validateEmployeeName();
        boolean nameCheck=v.validateName(name);
        if(nameCheck==true){
            System.out.println("Employee name is valid");
        }
        else{
            System.out.println("Employee name is invalid");
        }
        v=validateProductName();
        boolean productCheck=v.validateName(product);
        if(productCheck){
            System.out.println("Product name is valid");
        }
        else{
            System.out.println("Product name is invalid");
        }
    }
    
    public static Validate validateEmployeeName() 
    {
        Validate v=(name)->{
            if((name.length()<5 || name.length()>20)){
                
                return false;
            }
               for (int i = 0; i < name.length(); i++) {
                    char c = name.charAt(i);
                    if (!((c>='A' && c<='Z') || (c>='a' && c<='z') || (c==' '))) {
                        return false;
                    }
                    
            }
        
        return true;
        };
        return v;
    }
    
    public static Validate validateProductName() 
    {
        Validate v=(productName)->{
            productName=productName.toLowerCase();
            if(productName.length()!=6){
                return false;
            }
            if(productName.charAt(0)>='a' && productName.charAt(0)<='z' && productName.substring(1,6).matches("[0-9]+")){
                return true;
            }
            return false;
        };
        return v;
    }
}