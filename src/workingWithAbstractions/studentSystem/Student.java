package workingWithAbstractions.studentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    String getInfoForStudentsGrade() {
        if (grade >= 5.00) {
            return  "Excellent student.";
        } else if (grade >= 3.50) {
            return  "Average student.";
        }
        return  "Very nice person.";
    }

    @Override
    public String toString() {
        String output = String.format("%s is %s years old. %s", name, age, getInfoForStudentsGrade());
        return output;
    }
}
