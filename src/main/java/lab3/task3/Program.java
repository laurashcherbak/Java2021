//Lab 2. Завдання № 4.
//Створити List студентів з оцінками з трьох предметів (Фізика, Математика, Англійська мова). Завдання:
//● Написати метод для добавлення нового предмету усім студентам.
//● Написати метод для виведення студентів з усіма їхніми оцінками.
//● Вивести дані студента з найвищим середнім балом
//● Додати до класу Студент унікальний ідентифікатор.
//● Вивести Map де ключем буде унікальний ідентифікатор, а значенням - оцінки із заданого предмету (предмет задається через аргумент методу).
//
//Lab 3. Завдання № 3
//        Використати ієрархію і дані з лабораторної №2 (завдання 3, 4). Виконати завдання використовуючи Stream API:
//        ● Створити клас StudentSimple з основними даними про студента. Написати метод для перетворення List вхідних даних (List<Student>) у List<StudentSimple>;
//        ● Написати метод для видалення усіх студентів з середнім балом < 3;
//        ● Написати метод для виведення усіх оцінок з Англійської Мови без повторень;
//        ● Написати метод для сортування списку студентів за прізвищем, іменем та по-батькові;
//        ● Написати метод для знаходження студента з найвищим середнім балом;
//        ● Написати метод який буде повертати прізвища усіх студентів через дефіс.

package lab3.task3;

import java.util.*;
import java.util.stream.Collectors;

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
        //subjects2.add(english);
        students.add(new Student(0,"Ivan", "Ivanov", "Ivanovich", subjects));
        students.add(new Student(1,"Artem", "Artemov", "Artemovich", subjects2));

        students.add(new Student(2,"Ivanka", "Ivankova", "Ivankivna", subjects));

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


        System.out.println("Lab 3");
        //метод для перетворення List вхідних даних (List<Student>) у List<StudentSimple>;
        System.out.println("Transform List<Student> to List<StudentSimple>");
        printSimple(transform(students));
        //метод для видалення усіх студентів з середнім балом < 3;
        System.out.println("Delete bad students where average mark is less than 3 ");
        printSimple(transform(deleteBadStudents(students)));
        //метод для виведення усіх оцінок з Англійської Мови без повторень;
        System.out.println("Print all English marks");
        printEnglishMarks(getEnglishMark(students));
        //метод для сортування списку студентів за прізвищем, іменем та по-батькові;
        System.out.println("Sort students");
        print(sortStudents(students));
        //метод для знаходження студента з найвищим середнім балом;
        System.out.println("Best student : ");
        System.out.println(getBestStudentStream(students));
        //метод який буде повертати прізвища усіх студентів через дефіс.
        System.out.println("Add '-' between last name and return this string");
        System.out.println(addHyphen(students));


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

    public static void printEnglishMarks(final List<Mark> marks) {
        System.out.println("English Marks: ");
        for (final Mark m: marks) {
            System.out.println(m.getMark());
        }
    }

    public static void print(final Map<Integer, Student> studentMap) {
        System.out.println("Students Map: ");
        System.out.println(studentMap);
    }

    public static void printSimple(final List<StudentSimple> students) {
        System.out.println("StudentsSimple List: ");
        for (final StudentSimple st: students) {
            System.out.println(st.toString());
        }
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

    public static List<StudentSimple> transform(final List<Student> students) {
        return students.stream()
                .map(student -> new StudentSimple(student.getId(), student.getStudentName()))
                .collect(Collectors.toList());
    }

    public static List<Student> deleteBadStudents(final List<Student> students) {
        return students.stream()
                .filter(student -> student.getAvgMark() > 3)
                .collect(Collectors.toList());
    }

    public static List<Mark> getEnglishMark(final List<Student> students) {
        return students.stream()
                .filter(student -> student.getEnglishMark() != null)
                .map(student -> student.getEnglishMark())
                .distinct()
                .collect(Collectors.toList())
        ;
    }

    public static List<Student> sortStudents(final List<Student> students) {
        return students.stream()
                .sorted((o1, o2) -> {
                    return (o1.getStudentLastName() != o2.getStudentLastName()) ?
                                o1.getStudentLastName().compareTo(o2.getStudentLastName())
                                :
                                    (o1.getStudentName() != o2.getStudentName()) ?
                                        o1.getStudentName().compareTo(o2.getStudentName())
                                        :
                                        o1.getStudentMiddleName().compareTo(o2.getStudentMiddleName());
                }).collect(Collectors.toList());
    }

    public static String getBestStudentStream(final List<Student> students) {
        return students.stream()
                .reduce((a, b) -> a.getAvgMark() > b.getAvgMark() ? a : b)
                .get()
                .toString();
    }

    public static String addHyphen(final List<Student> students) {
        return students.stream()
                .map(student -> student.getStudentLastName())
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("");
    }


}
