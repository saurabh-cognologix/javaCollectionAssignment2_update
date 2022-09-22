package corejava.collection.assignmentset2.question4.solution;

import java.util.ArrayList;
import java.util.List;
import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {
	private final List<Student> studentList;

	public AverageMarksCalculator(List<Student> studentList) {
		this.studentList = studentList;
	}

	// get lowest id from the list of students
	public Integer getLowestIdFromTheListOfStudents() {
		Integer lowestID = studentList.get(0).getStudentId();
		for(Student student: studentList) {
			if(student.getStudentId() < lowestID) {
				lowestID = student.getStudentId();
			}
		}
//		System.out.println("Lowest id is " +lowestID);
		return lowestID;
	}

	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(Integer id) {
//		long countt = studentList.stream().filter((e)->e.getStudentId()).count();
//		Integer c = studentList.stream().filter((e)->id).count();
		Integer sum = 0;
		Integer count = 0;
		for(Student student: studentList) {
			if(student.getStudentId() == id) {
				sum += student.getStudentMarks();
				count++;
			}
		}
		return (double) (sum/count);

	}

}
