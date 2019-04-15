package by.bntu.fitr.povt.bugncrack.javalabs.model.entity;

public class Student {

	private String surname;
	private String name;
	private String patronymic;

	private int examMark;
	private int age;

	public Student() {
		
		surname = "no surname";
		name = "no name";
		patronymic = "no patronymic";
		examMark = 0;
	}

	public Student(String surname, String name, String patronymic, int examMark, int age) {
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.examMark = examMark;
		this.age = age;
	}

	public Student(Student student) {
		this.surname = student.surname;
		this.name = student.name;
		this.patronymic = student.patronymic;
		this.examMark = student.examMark;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public int getExamMark() {
		return examMark;
	}

	public void setExamMark(int examMark) {
		this.examMark = examMark;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + examMark;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (examMark != other.examMark)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [surname=").append(surname).append(", name=").append(name).append(", patronymic=")
				.append(patronymic).append(", examMark=").append(examMark).append("]");
		return builder.toString();
	}

}