package by.bntu.fitr.povt.bugncrack.javalabs.model.entity;

import java.util.Arrays;
import java.util.Scanner;

public class Group {
	public static final int DEFAULT_STUDENT_AMOUND = 15;

	private String groupName;
	private Student[] studentsArray;

	{
		studentsArray = new Student[0];
	}

	public Group() {
		this.groupName = "no name";
	}

	public Group(String groupName) {
		this.groupName = groupName;
	}

	public Group(Group group) {
		this.groupName = group.groupName;
		this.studentsArray = Arrays.copyOf(group.getStudentsArray(), group.getStudentsArray().length);
	}

	public void addStudent() {
		Scanner scanner = new Scanner(System.in);

		if (studentsArray.length < DEFAULT_STUDENT_AMOUND) {

			System.out.println("Enter surname of student:");
			String surname = scanner.nextLine();

			System.out.println("Enter name of student:");
			String name = scanner.nextLine();

			System.out.println("Enter patronymic of student:");
			String patronymic = scanner.nextLine();

			System.out.println("Enter exam mark of student:");
			int examMark = scanner.nextInt();
			System.out.println("Enter age of student:");
			int age = scanner.nextInt();

			studentsArray = Arrays.copyOf(studentsArray, studentsArray.length + 1);
			studentsArray[studentsArray.length - 1] = new Student(surname, name, patronymic, examMark, age);

			System.out.println("Successful addition of student.");
		} else
			System.out.println("No More Students can be entered");

	}

	public void removeStudent(int index) {

		if (index < 1 || index > studentsArray.length) {
			return;
		} else {
			System.out.println("Wrong index!");
		}

		studentsArray[index - 1] = null;

		for (int i = index - 1; i < studentsArray.length - 1; i++) {
			studentsArray[index - 1] = studentsArray[index];
		}

		Student[] temp = Arrays.copyOf(studentsArray, studentsArray.length - 1);
		studentsArray = temp;
	}

	public void changeStudent(int index) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter surname of student:");
		String surname = scanner.nextLine();

		System.out.println("Enter name of student:");
		String name = scanner.nextLine();

		System.out.println("Enter patronymic of student:");
		String patronymic = scanner.nextLine();

		System.out.println("Enter exam mark of student:");
		int examMark = scanner.nextInt();
		System.out.println("Enter age of student:");
		int age = scanner.nextInt();

		for (int i = 0; i < studentsArray.length; i++) {

			if (i == index - 1) {
				studentsArray[i].setSurname(surname);
				studentsArray[i].setName(name);
				studentsArray[i].setPatronymic(patronymic);
				studentsArray[i].setExamMark(examMark);
				studentsArray[i].setAge(age);
				break;
			}

		}
		System.out.println("Successful changing.");

	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudentsArray() {
		return Arrays.copyOf(studentsArray, studentsArray.length);
	}

	public void setStudentsArray(Student[] array) {
		this.studentsArray = array;
	}

	public int size(Student[] array) {
		return array.length;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < studentsArray.length; i++) {
			builder.append(i + 1).append(".").append(studentsArray[i]).append("\n");
		}
		return builder.toString();
	}

}