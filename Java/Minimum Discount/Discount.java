import java.util.*;
public class Discount{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     String temp;
     int n=sc.nextInt();
     sc.nextLine();
     ArrayList<String[]> arr=new ArrayList<String[]>();
     String minval="";
     for(int i=0;i<n;i++)
     {
         temp=sc.nextLine();
         arr.add(temp.split(","));
     }
     ArrayList<String> res=new ArrayList<String>();
     int mindis=2147483647;
     int tempdis=0;
     ArrayList<Integer> dis=new ArrayList<Integer>();
     for(int i=0;i<n;i++)
     {
         tempdis=Integer.parseInt(arr.get(i)[1])*Integer.parseInt(arr.get(i)[2])/100;
         dis.add(tempdis);
     }
     
     
     for(int i=0;i<dis.size();i++)
     {
         if(mindis>dis.get(i))
         {
             mindis=dis.get(i);
         }
     }
     
     for(int i=0;i<n;i++)
     {
         
         if((Integer.parseInt(arr.get(i)[1])*Integer.parseInt(arr.get(i)[2])/100)==mindis)
         {
             
             System.out.println(arr.get(i)[0]);
         }
     }
        
    }
}