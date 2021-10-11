//Завдання № 4.
//Створити List студентів з оцінками з трьох предметів (Фізика, Математика, Англійська мова). Завдання:
//● Написати метод для добавлення нового предмету усім студентам.
//● Написати метод для виведення студентів з усіма їхніми оцінками.
//● Вивести дані студента з найвищим середнім балом
//● Додати до класу Студент унікальний ідентифікатор.
//● Вивести Map де ключем буде унікальний ідентифікатор, а значенням - оцінки із заданого предмету (предмет задається через аргумент методу).

package lab2.task4;

import lab2.task4.Subject;

import java.util.*;

public class Program {
    public static void main(final String[] args) {
        final Subject math = new Subject("math", 2);
        final Subject english = new Subject("english", 3);
        final Subject physics = new Subject("physics", 4);
        final List<Subject> subjects = new ArrayList<>();
        subjects.add(math);
        subjects.add(english);
        final List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivan", subjects));
        students.add(new Student("Artem", subjects));
        students.add(new Student("Ivanka", subjects));
        System.out.println(students.toString());//initial state

        addSubject(students, physics);
        System.out.println(students);//After adding Subject to all Students

        final Map<Integer, Student> studentMap = new TreeMap<>();

        for(int i = 0; i < 3; i++) {
            studentMap.put(i + 1, students.get(i));
        }
        System.out.println(studentMap);

    }

    public static List<Student> addSubject(final List<Student> students, final Subject subject) {
        for (final Student st: students) {
            st.addSubject(subject);
            break;
        }

        return students;
    }

}
