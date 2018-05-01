import java.util.Scanner;

public class TeacherGrading{
	
	public static void main(Strings[] args){

		Scanner keyboard = new Scanner(System.in);
		int students;
		double max;

		students = keyboard.nextInt();
		double[] grades = new double[students];

		for(int i = 0; i<students ; i++){

			System.out.println("What was the grade of student" + (i+1));
			grades[i] = keyboard.nextDouble();

			if(grades[i] > 100 || grades[i]<0){

				System.out.println("Not a valid number, retype the grade of the student.");
				grades[i] = keyboard.nextDouble;

			}

			max = max + grades[i];

		}

		Arrays.sort(Grades);

		System.out.println("The grades in order were: ");
		System.out.println("Score       Letter Grade");
		System.out.println("*********************");

		for (int i = 0; i<Students; i++) {

			System.out.print("  " + Grades[i] + " ");

			if (Grades[i] > 90)
			{System.out.println(" \t\tA");}
			else if (Grades[i] > 80) 
			{System.out.println(" \t\tB");}	
			else if (Grades[i] > 70) 
			{System.out.println("  \t\tC");}
			else if (Grades[i] > 65) 
			{System.out.println(" \t\tD");}
			else
			{System.out.println(" \t\tF");}

		}

		System.out.println("The highest was a " + Grades[Students-1] + "%"+ " and the lowest was a " + Grades[0] +  "%");

		double Average =  max / Students;
	
		System.out.print("With a class average of " + Average + "%");

	}

}