package by.bntu.fitr.povt.bugncrack.javalabs.util;

import java.util.Comparator;

import by.bntu.fitr.povt.bugncrack.javalabs.model.entity.Student;

public class StudentSortingByMarkComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getExamMark() - student2.getExamMark();
	}

}
