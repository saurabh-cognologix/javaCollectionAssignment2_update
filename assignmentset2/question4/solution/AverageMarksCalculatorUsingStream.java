package corejava.collection.assignmentset2.question4.solution;

import corejava.collection.assignmentset2.question4.model.Student;

import java.util.*;


public class AverageMarksCalculatorUsingStream {
    //Finding the lowest id
    public Student getLowestIdStudent(List<Student> studentList){
        return studentList.stream()
                .min(Comparator.comparing(Student::getStudentId))
                .get();
    }

    //Counting lowest Id
    public Integer countingLowestId(List<Student> studentList,Student lowestIdStudent){

        return (Integer) (int) studentList.stream()
                .filter(student -> student.getStudentId().equals(lowestIdStudent.getStudentId()))
                .count();
    }

    // finding the average of student
    public Double getAverageMarks(List<Student> studentList,Integer lowestIdCount,Student lowestIdStudnet){

        Double totalMarks=studentList.stream()
                .filter(student -> student.getStudentId().equals(lowestIdStudnet.getStudentId()))
                .mapToDouble(Student::getStudentMarks)
                .sum();

        return totalMarks/lowestIdCount;
    }
}
