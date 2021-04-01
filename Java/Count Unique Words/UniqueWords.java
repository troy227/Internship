//import the necessary packages if needed
 import java.util.*;    
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student's Article");
    String s=sc.nextLine();
    
    String s1="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==('.') || s.charAt(i)==(',') ||s.charAt(i)==(':') ||s.charAt(i)==(';') ||s.charAt(i)==('?') ||s.charAt(i)==('!')){
            s1+="";
        }
        else{
            s1+=s.charAt(i);
        }
    }
    HashSet<String> hs=new HashSet<String>();
    String[] arr=s1.split(" ");
    int len=arr.length;
    for(String i:arr){
        hs.add(i.toLowerCase());
    }
    int x=hs.size();
    System.out.println("Number of words "+String.valueOf(len));
    System.out.println("Number of unique words "+String.valueOf(x));
    System.out.println("The words are");
    int count=1;
    List<String> list=new ArrayList<String>(hs);
    Collections.sort(list);
    for(String i:list){
        System.out.println(String.valueOf(count)+". "+i);
        count+=1;
    }
    
    }
        


}