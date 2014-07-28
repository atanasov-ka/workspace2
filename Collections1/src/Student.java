
public class Student {
	private int grade;
	private String name;
	public Student(int grade, String name)
	{
		this.setGrade(grade);
		this.setName(name);
	}
	
	public Student(Student copyFrom) {
		this(copyFrom.getGrade(), copyFrom.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if (grade < 2)
			grade = 2;
		if (grade > 6)
			grade = 6;
		
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "[grade=" + grade + ", name=" + name + "]";
	}
	
	
}
