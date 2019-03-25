package by.bntu.fitr.povt.bugncrack.javalabs.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import by.bntu.fitr.povt.bugncrack.javalabs.model.entity.Student;

public class ArrayInitializer {
	public static Student[] initArray(Student[] array) {

		File file = new File("src/students.txt", "students.txt");

		String[] entireFileContent;

		try (Scanner scanner = new Scanner(file)) {

			scanner.useDelimiter("\\A");
			String all = scanner.next();

			entireFileContent = all.split("\\n");
			String[] singleLine;

			for (int i = 0; i < entireFileContent.length; i++) {

				entireFileContent[i] = entireFileContent[i].trim();
				singleLine = entireFileContent[i].split("\\|");

				String surname = singleLine[0];
				String name = singleLine[1];
				String patronymic = singleLine[2];

				int examMark = Integer.parseInt(singleLine[3]);
				int age = Integer.parseInt(singleLine[4]);

				array = Arrays.copyOf(array, array.length + 1);
				array[array.length - 1] = new Student(surname, name, patronymic, examMark, age);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return array;
	}
}
