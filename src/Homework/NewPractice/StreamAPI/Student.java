package Homework.NewPractice.StreamAPI;

import java.util.List;

public class Student {

    private String getName;

    private List<Course> getAllCourses;

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    public List<Course> getGetAllCourses() {
        return getAllCourses;
    }

    public void setGetAllCourses(List<Course> getAllCourses) {
        this.getAllCourses = getAllCourses;
    }

    public Student(String getName, List<Course> getAllCourses) {
        this.getName = getName;
        this.getAllCourses = getAllCourses;
    }

}
