package by.bntu.fitr.povt.bugncrack.javalabs.model.logic;

import java.util.Arrays;

import by.bntu.fitr.povt.bugncrack.javalabs.model.entity.Student;
import by.bntu.fitr.povt.bugncrack.javalabs.util.StudentSortingByAlphabetComparator;
import by.bntu.fitr.povt.bugncrack.javalabs.util.StudentSortingByMarkComparator;

public class Manager {

	public static Student[] sortByAlphabet(Student[] array) {
		Arrays.sort(array, new StudentSortingByAlphabetComparator());
		return array;
	}

	public static Student[] sortByMark(Student[] array) {
		Arrays.sort(array, new StudentSortingByMarkComparator().reversed());
		return array;
	}

	public static double getAverageMark(Student[] array) {
		double avgMark = 0;

		for (int i = 0; i < array.length; i++) {
			avgMark += array[i].getExamMark();
		}
		avgMark /= array.length;

		return avgMark;
	}

	public static int findYoungest(Student[] array) {
		int minAge = array[0].getAge();
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getAge() < minAge) {
				minAge = array[i].getAge();
				minIndex = i + 1;
			}
		}

		return minIndex;
	}

	public static int findOldest(Student[] array) {
		int maxAge = array[0].getAge();
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getAge() > maxAge) {
				maxAge = array[i].getAge();
				maxIndex = i + 1;
			}
		}

		return maxIndex;
	}

	public static int findStudentWorstMark(Student[] array) {
		int minMark = array[0].getExamMark();
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getExamMark() < minMark) {
				minMark = array[i].getExamMark();
				minIndex = i + 1;
			}
		}

		return minIndex;
	}

	public static int findStudentBestMark(Student[] array) {
		int maxMark = array[0].getExamMark();
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getExamMark() > maxMark) {
				maxMark = array[i].getExamMark();
				maxIndex = i + 1;
			}
		}

		return maxIndex;
	}
	
}

