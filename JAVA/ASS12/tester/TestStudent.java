package tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

import com.cdac.core.Student;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yyyy");
		Student[] student = new Student[5];

		int counter = 0;
		int choice;
		boolean exit = true;

		while (exit) {
			System.out.println("Enter your choice");
			System.out.println("1. Add student");
			System.out.println("2. Display all student using normal for loop");
			System.out.println("3. Display all student using forEach Java8");
			System.out.println("4. Average of Students whose subject is Java");
			System.out.println("5. List of students whose age >23");
			System.out.println("6. Sort students by age");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter details");
				System.out.println("Rollno Email Dob Subject GPA");
				student[counter++] = new Student(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
				break;
			case 2:
				for (int i = 0; i < counter; i++)
					System.out.println(student[i]);
				break;
			case 3:
				System.out.println("-----xx-------------");
				Arrays.stream(student).filter(ss -> ss != null).forEach(i -> System.out.println(i));
				System.out.println("------------------");
				break;
			case 4:
				double avg = Arrays.stream(student).filter(s -> s != null).filter(s -> s.getSubject().equals("Java"))
						.mapToDouble(ss -> ss.getGpa()).average().orElse(-1);
				System.out.println("------------------");
				System.out.println("Average is-" + avg);
				System.out.println("------------------");
				break;
			case 5:
				LocalDate today = LocalDate.now();
				Arrays.stream(student).filter(ss -> ss != null)
						.filter(ss -> LocalDate.parse(ss.getDob(), dtf).until(today).getYears() > 23)
						.forEach(i -> System.out.println(i));
				break;
			case 6:
				Arrays.stream(student).filter(s -> s != null)
						.sorted((s1, s2) -> LocalDate.parse(s1.getDob(),dtf).compareTo(LocalDate.parse(s2.getDob(),dtf)))
						.forEach(i -> System.out.println(i));
				break;
			}
		}

		if (sc != null) {
			sc.close();
		}
	}

}
