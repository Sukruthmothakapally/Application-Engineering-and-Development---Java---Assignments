//This is the base class
import java.util.HashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private HashMap<String, Integer> quizScores;


    public Student(String firstName, String lastName, String country, HashMap<String, Integer> quizScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.quizScores = quizScores;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HashMap<String, Integer> getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(HashMap<String, Integer> quizScores) {
        this.quizScores = quizScores;
    }

   }