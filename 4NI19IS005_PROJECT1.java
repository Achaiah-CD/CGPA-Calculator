//This is the Main_Screen.java class and is present in the Main_head package

package Main_head;
import java.util.Scanner;
import Calculator.*;					//Importing packages.

interface inter							//Using an interface to operate the program.
{
	void begin();
}

class custom extends Exception      	//Exception Handling
{
	 custom(String s)
	{
		super(s);
		System.out.println(s);
		System.out.println("Exiting.");
	}
} 

class sleeping implements Runnable       	//Thread process
{
	Thread t;
	String c,name;
	Scanner scan=new Scanner(System.in);
	
	public sleeping(String newname)			//Constructor
	{
		name=newname;
		t=new Thread(this,name);
		t.start();
	}
		
	public void run()   					//Process run by child thread
	{ 
		try									//Exception Handling.
		{
			do
			{
				System.out.print("Waiting");
				for(int i=5;i>0;i--)
				{
					System.out.print("..");
					Thread.sleep(1000);
				}
				
				System.out.println();
				System.out.println("Press yes if ready. Else press no.");
				c=scan.nextLine();		
				}while(!(c.equalsIgnoreCase("yes")));
			}
			catch(InterruptedException e)
			{
				System.out.println("Child Thread interrupted.");
			}
		}
}

class Caller implements inter 
{
	private int i,m;
	private String c;
	String y=new String("yes");
	String n=new String("no");
	Scanner sc=new Scanner(System.in);
	int marks[]=new int[10];
	
	public void begin()
	{
		System.out.println();
		System.out.println("Do you know the subject order?");
		System.out.println("(Press yes only if you know. Else press any other key)");
		c=sc.nextLine();
		if(c.equalsIgnoreCase(y))
		{
			System.out.println();
			System.out.println("Please enter the marks in the correct order.");
			for(i=0;i<marks.length;i++)
			{
				m=sc.nextInt();
				marks[i]=m;
			}
			Display d=new Display(marks);			//Declaring Objects and Overloading
			d.total();								//Overriding
    		d.disp();
		}
		else
		{
			Display d=new Display();				//Overloading
			d.total();
			d.disp();
		}
		
		System.out.println("--------------------------------Thank You!!--------------------------------");
		sc.close();
	}
}

public class Main_Screen {
	public static void main(String[] args) throws custom{         //Exceptions are thrown in this class
		
		Scanner sc=new Scanner(System.in); 
		String c=new String();
		String y=new String("yes");
		String n=new String("no");
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------WELCOME--------------------------------");
		System.out.println("--------------------------------MY CGPA CALCI--------------------------");
		System.out.println();
		System.out.println("Shall I calculate your CGPA??");
		System.out.println("(yes or no)");
		c=sc.nextLine();
		
		if(c.equalsIgnoreCase(y)==true || c.equalsIgnoreCase(n)==true)
		{
			if(c.equalsIgnoreCase(n))
			{
				sleeping a=new sleeping("Wait");
				try {
					a.t.join();
				}
				catch(InterruptedException ex)
				{
					System.out.println("Process interrupted.");
				}
				inter s=new Caller();
				 s.begin();
			 }	
			 else if(c.equalsIgnoreCase(y))
			 {
				 inter s=new Caller();
				 s.begin();
			 }
		}
		else
		{
			sc.close();
			throw new custom("Invalid input.");
		}
		sc.close();
	}
}