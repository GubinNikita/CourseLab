package by.bntu.fitr.povt.bugncrack.javalabs.model.entity;

import java.util.Arrays;
import java.util.Scanner;

public class Group {
	public static final int DEFAULT_STUDENT_AMOUNT = 15;

	private String groupName;
	private Student[] studentsArray;

	{
		studentsArray = new Student[DEFAULT_STUDENT_AMOUNT];
	}

	public Group() {
		this.groupName = "no name";
	}

	public Group(String groupName) {
		this.groupName = groupName;
	}

	public Group(Group group) {
		this.groupName = group.groupName;

		for (int i = 0; i < DEFAULT_STUDENT_AMOUNT; i++) {
			studentsArray[i] = group.studentsArray[i];
		}
	}

	public void addStudent() {
		Scanner scanner = new Scanner(System.in);

		if (studentsArray[DEFAULT_STUDENT_AMOUNT - 1] != null) {
			System.out.println("No More Students can be entered");
		} else {

			for (int i = 0; i < DEFAULT_STUDENT_AMOUNT; i++) {
				if (studentsArray[i] == null) {

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

					studentsArray[i] = new Student(surname, name, patronymic, examMark, age);

					break;
				}
			}
		}
	}

	public void removeStudent(int index) {
		if ((index < 1 || index > DEFAULT_STUDENT_AMOUNT) && (studentsArray[index] == null)) {
			System.out.println("Unexisting student.");
		} else {
			studentsArray[index - 1] = null;

			for (int i = index - 1; i < DEFAULT_STUDENT_AMOUNT - 1; i++) {
				studentsArray[i] = studentsArray[i + 1];
			}

			if (studentsArray[DEFAULT_STUDENT_AMOUNT - 1] != null) {
				studentsArray[DEFAULT_STUDENT_AMOUNT - 1] = null;
			}
		}
	}

	public void changeStudent(int index) {

		if (studentsArray[index] != null) {

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

			for (int i = 0; i < DEFAULT_STUDENT_AMOUNT; i++) {

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
		} else {
			System.out.println("Unexsisting student.");
		}
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

		for (int i = 0; i < DEFAULT_STUDENT_AMOUNT; i++) {
			if (studentsArray[i] != null) {
				builder.append(i + 1).append(".").append(studentsArray[i]).append("\n");
			}
		}
		return builder.toString();
	}

}