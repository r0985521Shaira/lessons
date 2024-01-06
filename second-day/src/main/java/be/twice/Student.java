package be.twice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private HashMap<String, Integer> studentSubjectAndGrades = new HashMap<>();
    private List<String> favoriteSubjects = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addStudentSubjectAndPoints(String subject, Integer points) throws PointsBelowZeroExcepetion {
        if (points < 0) {
            throw new PointsBelowZeroExcepetion();
        }
        studentSubjectAndGrades.put(subject, points);
    }

    public void showAllStudentPoints() {
        System.out.println("The student points are " + studentSubjectAndGrades.values());
    }

    public void showAllStudentSubject() {
        System.out.println("The student subjects are " + studentSubjectAndGrades.keySet());
    }

    public void addFavoriteSubject(String subject) {
        favoriteSubjects.add(subject);
    }

    public void showAllFavoriteSubject() {
        for (int i = 0; i < favoriteSubjects.size(); i++) {
            System.out.println(favoriteSubjects.get(i));
        }
    }

}
