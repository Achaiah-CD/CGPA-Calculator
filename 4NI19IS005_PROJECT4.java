//This is the Display.java class and is present in the Calculator package

package Calculator;
import java.text.DecimalFormat;
public class Display extends Sgpa{					//Multi-level inheritance.
	
	DecimalFormat two_decimal=new DecimalFormat("#.##");
	public  Display()
	{
		super();
	}
	public Display(int marks[])
	{
		super(marks);
	}
	
	public void disp()						//Displaying the final result.
	{
		float Cgpa=Float.valueOf(two_decimal.format(avg));				//Shortening float to 2 decimal places.
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("\t\tSemester 4 \t\t Credits registered: 24\t\tCredits earned: "+earn);
		System.out.println();
		System.out.println("Course Code\tCourse Name\t\t\t\tGP\tGrade");
		System.out.println();
		System.out.println("MA4C03\t\tMathematics\t\t\t\t"+a[0]+"\t"+c[0]);
		System.out.println("IS4C01\t\tSoftware Engineering\t\t\t"+a[1]+"\t"+c[1]);
		System.out.println("IS4C02\t\tComputer Organization\t\t\t"+a[2]+"\t"+c[2]);
		System.out.println("IS4C03\t\tAnalysis and Design of Algorithms\t"+a[3]+"\t"+c[3]);
		System.out.println("IS4C04\t\tObject Oriented Programming with Java   "+a[4]+"\t"+c[4]);
		System.out.println("IS4C05\t\tDatabase Systems \t\t\t"+a[5]+"\t"+c[5]);
		System.out.println("IS4L01\t\tAnalysis and Design of Algorithms Lab\t"+a[6]+"\t"+c[6]);
		System.out.println("IS4L02\t\tDatabase Systems Lab\t\t\t"+a[7]+"\t"+c[7]);
		System.out.println("HS4C01\t\tConstitution of India\t\t\t"+a[8]+"\t"+c[8]);
		System.out.println("HS4KA1\t\tKannada\t\t\t\t\t"+a[9]+"\t"+c[9]);
		System.out.println();
		System.out.println("SGPA : "+Cgpa);
		System.out.println();
		System.out.println();
	}
}