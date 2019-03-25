package by.bntu.fitr.povt.bugncrack.javalabs.util;

import java.util.Formatter;

import by.bntu.fitr.povt.bugncrack.javalabs.model.entity.Student;

public class FileInput {
	public static void fileInput(Student[] array) {

		try (Formatter f = new Formatter("students.txt")) {

			for (int i = 0; i < array.length; i++) {
				f.format("%s|%s|%s|%d|%d\n", array[i].getSurname(), array[i].getName(), array[i].getPatronymic(),
						array[i].getExamMark(), array[i].getAge());
			}
			f.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
