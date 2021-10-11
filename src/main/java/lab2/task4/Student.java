package lab2.task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public class Student {
    private String studentName;
    private List<Subject> subjects = new LinkedList<>();
    public static Integer id = Counter.counter++;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
//
//    public void setSubjects(final List<Subject> subjects) {
//        this.subjects = subjects;
//    }

    public void addSubject(final Subject subject) {
        this.subjects.add(subject);
    }

    public Student(final String studentName, final List<Subject> subjects) {
        this.studentName = studentName;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Student{" +
//                "studentName='" + studentName + '\'' +
//                ", subjects=" + subjects +
//                '}';
//    }
//
//    @Override
//    public boolean equals(final Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        final Student student = (Student) o;
//        return studentName.equals(student.studentName) && subjects.equals(student.subjects);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(studentName, subjects);
//    }
}
