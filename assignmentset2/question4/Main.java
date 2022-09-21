package corejava.collection.assignmentset2.question4;

import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.parser.StudentInputParser;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;


import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] inputData = { "22, Data Structures, 45", "23, English, 52", "22, English, 51",
				"26, Data Structures, 72", "23, Data Structures, 61", "24, English, 81", };


		StudentInputParser inputParser = new StudentInputParser();
		List<Student> studentList = inputParser.parseArray(inputData);

		AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(studentList);

		// get lowest id from the list of students
		Integer lowestId = averageMarksCalculator.getLowestIdFromTheListOfStudents();

		// get average marks for the student having lowest id
		Double average = averageMarksCalculator.getAverageMarksForTheStudent(lowestId);

		// print the results
		System.out.println("Average marks of student with lowest Id " + lowestId + " is: " + average);
		

	}

}
