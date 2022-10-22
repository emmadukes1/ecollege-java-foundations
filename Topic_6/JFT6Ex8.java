//The following table shows the grades that a teacher could give a student on a test.
//• Create a Java program, which contains a variable storing a student’s grade.
//• The variable should be of type float. Store a value of 45.00.
//• Determine the appropriate grade.

public class JFT6Ex8 {

    public static void main(String[] args) {

        float studentGradePercent;
        String grade;

        studentGradePercent = 45.00f;

        if (studentGradePercent <= 100.00f  && studentGradePercent >= 85.00f) {
            grade = "A";
        }

        else if (studentGradePercent < 85.00f  && studentGradePercent >= 70.00f) {
            grade = "B";
        }

        else if (studentGradePercent < 70.00f  && studentGradePercent >= 55.00f) {
                grade = "C";
        }

        else if (studentGradePercent < 55.00f  && studentGradePercent >= 40.00f) {
                grade = "D";
        }

        else if (studentGradePercent < 40.00f  && studentGradePercent >= 25.00f) {
            grade = "E";
        }

        else if (studentGradePercent < 25.00f  && studentGradePercent >= 10.00) {
            grade = "F";
        }

        else if (studentGradePercent < 10.00f  && studentGradePercent >=0.00f) {
            grade = "no grade";
        }

        else{
                grade = "invalid entry";
        }

        System.out.println("Grade: " + grade);
    }
}