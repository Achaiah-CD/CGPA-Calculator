//This is the Grade.java class and is present in the Calculator package

package Calculator;
import java.util.Scanner;

public class Grade									//Super Class
{	
	int marks[]=new int[10];
	float credits[]= {3,3,4,3,3,3,1.5f,1.5f,1,1};     				//Credits are known by Default
	private int i,j=1;												//as it is only for the 4th Semester.
	float sum=0;
	Scanner sc=new Scanner(System.in);
	
	public Grade()									//Constructor
	{
		System.out.println();
		System.out.println("Enter the marks in the following order:(Out of 100)");
		System.out.print("MA4C01: ");
		marks[0]=sc.nextInt();
		
		for(i=1;i<=5;i++)
		{
			System.out.print("IS4C0"+i+": ");
			marks[i]=sc.nextInt();
		}
		for(i=6;i<=7;i++)
		{
			System.out.print("IS4L0"+j+": ");
			marks[i]=sc.nextInt();
			j++;
		}
		
		System.out.print("HS4C01: ");
		marks[8]=sc.nextInt();
		
		System.out.print("HS4KA1: ");
		marks[9]=sc.nextInt();
	}
	
	public Grade(int marks[])								//When the subject order is known.
	{
		for(i=0;i<10;i++)
			this.marks[i]=marks[i];
	}
	
	 public void total()									//Calculating the total credits for the Semester.
	{
		for(i=0;i<credits.length;i++)
			sum+=credits[i];
	}
}