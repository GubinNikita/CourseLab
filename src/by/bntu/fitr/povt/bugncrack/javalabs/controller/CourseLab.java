// develop branch
package by.bntu.fitr.povt.bugncrack.javalabs.controller;

import by.bntu.fitr.povt.bugncrack.javalabs.model.entity.Group;
import by.bntu.fitr.povt.bugncrack.javalabs.model.logic.Manager;
import by.bntu.fitr.povt.bugncrack.javalabs.util.UserInput;
import by.bntu.fitr.povt.bugncrack.javalabs.view.Printer;

public class CourseLab {

	public static void main(String[] args) {
		Group group = new Group();
		boolean isExit = false;

		while (!isExit) {

			Printer.print("Menu:" + "\n1.add student" + "\n2.remove student by number" + "\n3.change student by number"
					+ "\n4.show group" + "\n5.sort group by alphabet" + "\n6.sort group by mark(descending)"
					+ "\n7.find youngest student" + "\n8.find oldest student" + "\n9.find student with best mark"
					+ "\n10.find student with worst mark" + "\n11.show average mark" + "\n12.Exit\n");

			switch (Integer.parseInt(UserInput.input("\nChoose option:"))) {
			case 1:
				group.addStudent();
				break;
			case 2:
				int indexToRemove = Integer
						.parseInt(UserInput.input("\nInput the index of student you want to remove:"));
				group.removeStudent(indexToRemove);
				break;
			case 3:
				int indexToChange = Integer
						.parseInt(UserInput.input("\nInput the index of student you want to change:"));
				group.changeStudent(indexToChange);
				break;
			case 4:
				Printer.print("" + group);
				break;
			case 5:
				group.setStudentsArray(Manager.sortByAlphabet(group.getStudentsArray()));
				break;
			case 6:
				group.setStudentsArray(Manager.sortByMark(group.getStudentsArray()));
				break;
			case 7:
				Printer.print("" + Manager.findYoungest(group.getStudentsArray()));
				break;
			case 8:
				Printer.print("" + Manager.findOldest(group.getStudentsArray()));
				break;
			case 9:
				Printer.print("" + Manager.findStudentBestMark(group.getStudentsArray()));
				break;
			case 10:
				Printer.print("" + Manager.findStudentWorstMark(group.getStudentsArray()));
				break;
			case 11:
				Printer.print("" + Manager.getAverageMark(group.getStudentsArray()));
				break;
			case 12:
				isExit = true;
				break;
			default:
				Printer.print("Wrong number!");
				break;
			}
			UserInput.input("Input any key to continue...");
		}

	}

}
