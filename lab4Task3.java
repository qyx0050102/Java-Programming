public class lab4Task3 {
    public static void printGrade(int score) {
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("The grade is " + grade);
    }

    public static void main(String[] args) {
        printGrade(85);
    }
}