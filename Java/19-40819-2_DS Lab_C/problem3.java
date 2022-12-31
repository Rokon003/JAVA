
import java.util.Scanner;
public class Student{
	
    String id;
    int credits;
    double cgpa;
	
    Student(String id, int credits,double cgpa){
		
        this.cgpa = cgpa;
        this.credits =credits;
        this.id = id;
    }
}

public class Student {
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("How many students info do you want to enter?: ");
		int count = scanner.nextInt();
        Student[] students = new Student[count];
        for (int i = 0; i <count ; i++) {
			
            System.out.print("Enter " +(i+1)+ " student ID: ");
            String id = scanner.next();
            System.out.print("Enter " +(i+1)+ " student CGPA: ");
            double cgpa = scanner.nextDouble();
            System.out.print("Enter " +(i+1)+ " student completed Credits: ");
            int cgar = scanner.nextInt();
            students[i] = new Student(id,cgar,cgpa);
        }
        
        System.out.println("Student's ID whose CGPA is more then 3.75");
        for (Student student:students) {
			
            if(student.cgpa >= 3.75){
				System.out.println(student.id);
            }

        }
        System.out.println("Student's ID whose has completed 50 Credits");
        for (Student student:students) {
            if(student.credits >= 50){
                System.out.println(student.id);
            }

        }

    }
}


