package Exceptions;

import java.util.*;
public class ArrayException {
    public String getPriceDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=sc.nextInt();
        System.out.println("Enter the price details");
        int[] arr=new int[size];
        try{
           for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            } 
        }
        catch(RuntimeException r){
            return "Input was not in the correct format";
        }
        
        System.out.println("Enter the index of the array element you want to access");
        int index=sc.nextInt();
        try{
            return "The array element is "+String.valueOf(arr[index]);
        }
        catch(RuntimeException r){
            return "Array index is out of range";
        }
    }
    public static void main(String[] args){
        ArrayException e=new ArrayException();
        System.out.println(e.getPriceDetails());
    }
}
