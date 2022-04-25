package Homework.NewPractice.StreamAPI;

import java.util.Objects;

public class Course {

    private String getName;

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }


    public Course(String getName) {
        this.getName = getName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getGetName().equals(course.getGetName());
    }

}



