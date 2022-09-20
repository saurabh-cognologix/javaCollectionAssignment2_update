package corejava.collection.assignmentset2.question4.solution;

import java.util.ArrayList;
import java.util.List;
import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {

	// map input array to list of Student
	public List<Student> mapInputArrayToListOfStudent(String[] studentData) {
		List<Student> studentList = new ArrayList<>();

		for (String line : studentData ) {
			String[] values = line.split(",");

			Integer id = Integer.parseInt(values[0].trim());
			String subject = values[1].trim();
			Integer marks = Integer.parseInt(values[2].trim());

			Student student = new Student(id, subject, marks);
			studentList.add(student);
		}
		return studentList;
	}

	// get lowest id from the list of students
	public Integer getLowestIdFromTheListOfStudents(List<Student> inputList) {
		Integer lowestId = inputList.get(0).getStudentId();

		for (Student student : inputList ) {
			if (lowestId > student.getStudentId()){
				lowestId = student.getStudentId();
			}
		}
		return lowestId;
	}


	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(List<Student> studentList) {
		Integer id = getLowestIdFromTheListOfStudents(studentList);
		Double sum = 0.0;
		Double average;

		for (Student student : studentList){
			if (id == student.getStudentId()){
				sum += student.getStudentMarks();
			}
		}
		average = sum / studentList.size();
		return average;
	}




}
