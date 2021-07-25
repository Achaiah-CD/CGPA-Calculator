//This is the SGPA.java class and is present in the Calculator package

package Calculator;

public class Sgpa extends Grade            //Inherited sub class 
{
	float avg=0,earn=0;
	 int i;
	int[] a=new int[10];
	char[] c=new char[10];
	float calc=0;
	
	public Sgpa()				//Constructor
	{
		super();
	}
	public Sgpa(int marks[])
	{
		super(marks);
	}
	
	 public void total()							//Here we assign the Grade point and Grade for each subject.
	{
		super.total();
		
		for(i=0;i<10;i++)
		{
			if(marks[i]>=90 && marks[i]<=100)
			{
				a[i]=10;
				c[i]='S';
			}
			else if(marks[i]>=75 && marks[i]<=89)
			{
				a[i]=9;
				c[i]='A';
			}
			else if(marks[i]>=60 && marks[i]<=74)
			{
				a[i]=8;
				c[i]='B';
			}
			else if(marks[i]>=50 && marks[i]<=59)
			{
				a[i]=7;
				c[i]='C';
			}
			else if(marks[i]>=45 && marks[i]<=49)
			{
				a[i]=5;
				c[i]='D';
			}
			else if(marks[i]<45)
			{
				a[i]=0;
				c[i]='F';
			}
			
			
			if(c[i]=='F')									//Calculating the total credits earned.
				earn+=0;
			else 
				earn+=credits[i];
			
			
			calc+=((float)a[i]*credits[i]);           
		}
		
		avg=calc/sum; 									//Calculating the SGPA.
	}
}