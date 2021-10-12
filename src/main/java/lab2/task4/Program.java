//Завдання № 4.
//Створити List студентів з оцінками з трьох предметів (Фізика, Математика, Англійська мова). Завдання:
//● Написати метод для добавлення нового предмету усім студентам.
//● Написати метод для виведення студентів з усіма їхніми оцінками.
//● Вивести дані студента з найвищим середнім балом
//● Додати до класу Студент унікальний ідентифікатор.
//● Вивести Map де ключем буде унікальний ідентифікатор, а значенням - оцінки із заданого предмету (предмет задається через аргумент методу).

package lab2.task4;

//import lab2.task4.Subject;

import java.util.*;

public class Program {
    public static void main(final String[] args) {
        //Створити List студентів з оцінками з трьох предметів (Фізика, Математика, Англійська мова). Завдання:
        final List<Student> students = new ArrayList<>();

        final Subject art = new Subject("art", new Mark(10));
        final Subject bio = new Subject("bio", new Mark(12));
        final Subject math = new Subject("math", new Mark(2));
        final Subject english = new Subject("english", new Mark(3));
        final Subject physics = new Subject("physics", new Mark(4));
        final List<Subject> subjects = new ArrayList<>();
        subjects.add(math);
        subjects.add(english);
        final List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(art);
        subjects2.add(bio);
        students.add(new Student(0,"Ivan", subjects));
        students.add(new Student(1,"Artem", subjects2));

        students.add(new Student(2,"Ivanka", subjects));
        //● метод для виведення студентів з усіма їхніми оцінками.
        print(students);//initial state

        //● метод для добавлення нового предмету усім студентам.
        addSubject(students, physics);

        //● метод для виведення студентів з усіма їхніми оцінками.
        print(students);//After adding Subject to all Students

        //● Вивести дані студента з найвищим середнім балом
        System.out.println("Best Student: ");
        final Student bestStudent = getBestStudent(students);
        System.out.println("The Best Student: " + bestStudent.getStudentName()
                        + ", AvgMark: " + bestStudent.getAvgMark());


        //● Вивести Map де ключем буде унікальний ідентифікатор, а значенням - оцінки із заданого предмету (предмет задається через аргумент методу).
        final Map<Integer, Student> studentMap = new TreeMap<>();
        for(int i = 0; i < 3; i++) {
            studentMap.put(i, students.get(i));
        }
        //● метод для виведення студентів з усіма їхніми оцінками.
        print(studentMap);


    }

    //● метод для добавлення нового предмету усім студентам.
    public static List<Student> addSubject(final List<Student> students, final Subject subject) {
        for (final Student st: students) {
            st.addSubject(subject);
            break;
        }

        return students;
    }

    public static void print(final List<Student> students) {
        System.out.println("Students List: ");
        for (final Student st: students) {
            System.out.println(st.toString());
        }
    }

    public static void print(final Map<Integer, Student> studentMap) {
        System.out.println("Students Map: ");
        System.out.println(studentMap);
    }

    //● студент з найвищим середнім балом
    public static Student getBestStudent(final List<Student> students) {
        double bestAvgMark = 0.0;
        Student bestStudent = null;
        for (final Student student : students) {
            if (bestStudent == null) {
                bestAvgMark = student.getAvgMark();
                bestStudent = student;
            }
            if (student.getAvgMark() > bestAvgMark) {
                bestAvgMark = student.getAvgMark();
                bestStudent = student;
            }
        }
        return bestStudent;
    }

}
