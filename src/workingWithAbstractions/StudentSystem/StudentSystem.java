package workingWithAbstractions.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsInfo;

    public StudentSystem() {
        this.studentsInfo = new HashMap<>();
    }

    public void parseCommand(String[] args) {

        if (args[0].equals("Create")) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            if (!studentsInfo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentsInfo.put(name, student);
            }
        } else if (args[0].equals("Show")) {
            String name = args[1];
            if (studentsInfo.containsKey(name)) {
                Student student = studentsInfo.get(name);
                System.out.println(student.toString());
            }
        }
    }


}
