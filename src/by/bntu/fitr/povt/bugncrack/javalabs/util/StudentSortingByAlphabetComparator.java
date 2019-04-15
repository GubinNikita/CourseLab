package by.bntu.fitr.povt.bugncrack.javalabs.util;

import java.util.Comparator;

import by.bntu.fitr.povt.bugncrack.javalabs.model.entity.Student;

public class StudentSortingByAlphabetComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		int result = 0;

		int surnameCompare = student1.getSurname().compareTo(student2.getSurname());
		int nameCompare = student1.getName().compareTo(student2.getName());
		int patronymicCompare = student1.getPatronymic().compareTo(student2.getPatronymic());

		if (surnameCompare == 0) {
			if (nameCompare == 0) {
				if (patronymicCompare != 0)
					result = patronymicCompare;
			} else
				result = nameCompare;
		} else
			result = surnameCompare;

		return result;
	}

}
