package corejava.collection.assignmentset2.question4;

import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.parser.StudentInputParser;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculatorUsingStream;


import java.util.List;

public class Main {

	public static void main(String[] args) {

        String inputFilePath = "JavaTraining/src/corejava/collection/assignmentset2/question4/input/input.csv";
		StudentInputParser inputParser = new StudentInputParser();
		List<Student> studentList = inputParser.parseCSVFile(inputFilePath);


		AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(studentList);
		// get lowest id from the list of students
		Integer lowestId = averageMarksCalculator.getLowestIdFromTheListOfStudents();

		// get average marks for the student having lowest id
		Double average = averageMarksCalculator.getAverageMarksForTheStudent(lowestId);

		// print the results
		System.out.println("Average marks of student with lowest Id " + lowestId + " is: " + average);

		System.out.println("-------------------Using Stream-----------------");

		AverageMarksCalculatorUsingStream averageMarksCalculatorUsingStream = new AverageMarksCalculatorUsingStream();
		Student lowestIdStream = averageMarksCalculatorUsingStream.getLowestIdStudent(studentList);
		Integer numberOfLowestId = averageMarksCalculatorUsingStream.countingLowestId(studentList,lowestIdStream);
		Double averageMarks = averageMarksCalculatorUsingStream.getAverageMarks(studentList,numberOfLowestId,lowestIdStream);
		System.out.println(averageMarks);

	}

}
