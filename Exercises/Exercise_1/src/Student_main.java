//This is the Main class

import java.util.ArrayList;
import java.util.HashMap;

public class Student_main {
    private static String[] names = {"Sukruth", "Sam", "Rahul", "Bittu", "Chay", "Prajwal", "Rakshith", "Brijesh", "Nitin", "Richul", "Shiv", "Swaroop"};
    private static String[] subjects = {"Data Science", "Java", "Cloud computing", "Program structures", "Coop", "Network structures"};
    private static String[] countries = {"India", "USA", "Germany"};
    public static void main(String[] args) {
        //generating random quiz scores
        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            HashMap<String, Integer> quizScores = new HashMap<>();
            for (int j = 0; j < 15; j++) {
                int minScore = 0;
                int maxScore = 100;
                int quizScore = (int) (Math.random()*(maxScore-minScore+1)+minScore);

                int subjectIndex = (int) (Math.random()*((subjects.length - 1) +1)+0);
                quizScores.put(subjects[subjectIndex], quizScore);
            }
            //randomly generating first name , last name , countries and exam scores
            int firstNameIndex = (int) (Math.random()*((names.length - 1) +1)+0);
            int lastNameIndex = (int) (Math.random()*((names.length - 1) +1)+0);
            int countryIndex = (int) (Math.random()*((countries.length - 1) +1)+0);
            int examScore1 = (int) (Math.random()*((500 - 1) +1)+0);
            int examScore2 = (int) (Math.random()*((500 - 1) +1)+0);

            int partTime = (int) (int) (Math.random()*((1 - 0) +1)+0);
            if (partTime == 1) {
                Student student = new Parttime(names[firstNameIndex], names[lastNameIndex], countries[countryIndex], quizScores);
                students.add(student);
            }
            else  {
                Student student = new Fulltime(names[firstNameIndex], names[lastNameIndex], countries[countryIndex], quizScores, examScore1, examScore2);
                students.add(student);
            }
        }

        Student_session session = new Student_session(students);
        System.out.println("----Quiz score average---- \n"+session.AverageScore());
        System.out.println("\n----Quiz Scores ascending order----");
        session.ScoresAscending();
        System.out.println("\n----Part time students----");
        session.PartTime();
        System.out.println("\n----Full time students---- ");
        session.FullTime();
    }
}
