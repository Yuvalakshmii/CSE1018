import java.util.*;
import java.lang.*;

public class MarkGrade{
	public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter no of students: ");
	int n=scan.nextInt();
	// storing roll no, name, dept,semester, mark in an array
	int r[]=new int[22];
	int mark[][]= new int[22][3];
	String name[]= new String[22];
	String department[]= new String[22];
	String semester[]= new String[22];
	
	int i,j;
	
	for(i=0;i<n;i++){
		System.out.println("No of students: " + (i+1));
		System.out.println("Enter roll number: ");	
		r[i]=scan.nextInt();
		System.out.println("Enter name: ");
		name[i]=scan.next();	
		System.out.println("Enter department: ");
		department[i]=scan.next();		
		System.out.println("Enter semester: ");
		semester[i]=scan.next();
		//for mark alone nested for loop cos its 2D array
		for(j=0;j<3;j++){
		System.out.println("Enter mark: ");
		mark[i][j]=scan.nextInt();
		}
		
	}
	System.out.println("Displaying records of " + n + "students");
	for(i=0;i<n;i++){
		System.out.println("student no " + (i+1));
		System.out.println("roll no: " + r[i]);
		System.out.println("name: " + name[i]);
		System.out.println("dept: " + department[i]);
		System.out.println("sem: " + semester[i]);
		System.out.println("marks are: ");	
		
		int sum=0;
		for(j=0;j<3;j++)
		{
		System.out.println(mark[i][j]);
		sum=sum+mark[i][j];
		}
		System.out.println("total: " + sum);
		
		int avg=sum/3;
		System.out.println("average: " + avg);
		
		if(avg>=95 && avg<=100){
		System.out.println("grade is S");}
		else if(avg>=90 && avg<95){
		System.out.println("grade is A");}
		else
		{
		System.out.println("Invalid grade!");
		}
			
		
	}
	scan.close();
	
	}
}








