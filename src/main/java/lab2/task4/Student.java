package lab2.task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
//import java.util.TreeMap;

public class Student {
    private String studentName;
    private List<Subject> subjects = new LinkedList<>();
    //● Додати до класу Студент унікальний ідентифікатор.
    public Integer id;
    public double AvgMark = 0.0;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public double getAvgMark() {
        double avg = 0.0;
        int count = 0;
        for(final Subject sb: this.subjects) {
            count++;
            avg += sb.getMark().getMark();
        }
        return avg / count;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(final Subject subject) {
        this.subjects.add(subject);
    }

    public Student(final String studentName, final List<Subject> subjects) {
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public Student(final Integer id, final String studentName, final List<Subject> subjects) {
        this.id = id;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    //● метод для виведення студента з усіма оцінками.
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Student student = (Student) o;
        return studentName.equals(student.studentName) && subjects.equals(student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, subjects);
    }
}
