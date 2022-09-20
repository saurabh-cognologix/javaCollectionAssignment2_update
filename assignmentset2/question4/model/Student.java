package corejava.collection.assignmentset2.question4.model;

public class Student {
	private Integer studentId;
	private String studentSubject;
	private Integer studentMarks;

	public Student(Integer studentId, String studentSubject, Integer studentMarks) {
		super();
		this.studentId = studentId;
		this.studentSubject = studentSubject;
		this.studentMarks = studentMarks;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentSubject() {
		return studentSubject;
	}

	public Integer getStudentMarks() {
		return studentMarks;
	}

	@Override
	public String toString() {
		String placeHoder = "id :{0}, name:{1}, marks:{2}";
		return java.text.MessageFormat.format(placeHoder, studentId, studentSubject,
				studentMarks);
	}

}
