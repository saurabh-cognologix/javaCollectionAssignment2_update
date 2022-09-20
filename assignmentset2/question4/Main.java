package corejava.collection.assignmentset2.question4;

import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;


import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] inputData = { "22, Data Structures, 45", "23, English, 52", "22, English, 51",
				"26, Data Structures, 72", "23, Data Structures, 61", "24, English, 81", };



		AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator();
		List<Student> studentList = averageMarksCalculator.mapInputArrayToListOfStudent(inputData);


		Double average = averageMarksCalculator.getAverageMarksForTheStudent(studentList);
		System.out.println("Average marks of student with lowest id is ===> "+ average);
		

	}

}
