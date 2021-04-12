package Placement_Enrollment;








import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all roll numbers separated by comma");
        String roll=sc.nextLine();
        roll=roll.toUpperCase();
        //System.out.println(roll);
        
        System.out.println("Enter the department name acronym");
        String dep=sc.nextLine();
        String depName=dep.toUpperCase();
        
        Stream<String> rollNo=getRollNumbers(roll);
        int count=getCount(rollNo,depName);
        if(count!=0){
            System.out.println("Number of students in "+dep+ " is "+count);
        }
        else{
            System.out.println("No students from "+dep);
        }
        




	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		Stream<String> st=Arrays.stream(rollNumbers.split(","));
        //stream.forEach(s -> System.out.println(s.substring(0,2)));
        return st;


	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		long count=rollNumberStream.filter(c->c.toUpperCase().substring(0,2).equals(dept.toUpperCase())).distinct().count();
        return (int)count;


	}

}
