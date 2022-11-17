//this is the session class

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Student_session {
    private static final DecimalFormat df = new DecimalFormat("#.##");

    private ArrayList<Student> students;

    public Student_session(ArrayList<Student> students) {
        this.students = students;
    }

// method to calculate average of the quiz scores
    public double AverageScore() {

        double total = 0;
        double count = 0;
        for (Student student: students) {
            for (Map.Entry<String, Integer> set :
                    student.getQuizScores().entrySet()) {
                total += set.getValue();
                count += 1;
            }
        }
        return Math.abs(total/count);
    }
//method to display the quiz scores in ascending order
    public void ScoresAscending() {
        ArrayList<Integer> quizScores = new ArrayList();
        for (Student student: students) {
            for (Map.Entry<String, Integer> set :
                    student.getQuizScores().entrySet()) {
                quizScores.add(set.getValue());
            }
        }
        System.out.println(quizScores);
    }
    //method to display names of part time students
    public void PartTime() {
        for(Student student: students) {
            if (student instanceof Parttime) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }
//method to display names of full time students
    public void FullTime() {
        for(Student student: students) {
            if (student instanceof Fulltime) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }
}
