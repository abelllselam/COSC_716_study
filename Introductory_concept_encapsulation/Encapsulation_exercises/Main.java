package Introductory_concept_encapsulation.Encapsulation_exercises;

public class Main {
    public static void main(String[]args){
        StudentRecord rec1 = new StudentRecord("001", "Alice");
        rec1.addGrade(85);
        rec1.addGrade(92);
        rec1.addGrade(78);

        System.out.println(rec1);

        StudentRecord rec2 = new StudentRecord("002", "Bob");
        System.out.println("Average for " + rec2.getStudentId() + ": " + rec2.getAverage());
        System.out.println("Highest for "+ rec2.getStudentId() + ": " + rec2.getHighestGrade());

        try {
            rec1.getGrades().add(100);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify grades externally");
        }
        // ⇒ Cannot modify grades externally

        // 4) Invalid grade validation
        try {
            rec1.addGrade(110);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid grade: " + e.getMessage());
        }
    }
}
