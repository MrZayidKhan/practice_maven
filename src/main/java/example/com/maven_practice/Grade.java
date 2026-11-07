package example.com.maven_practice;

public class Grade {
    public static String Grade(int marks) {
        if (marks >= 80 && marks <= 100) {
            return "A";
        } 
        else if (marks >= 60 && marks < 80) {
            return "B";
        } 
        else if (marks >= 0 && marks < 60) {
            return "C";
        } 
        else {
            return "Invalid marks";
        }
    }
}