//Завдання № 2.
//Створити клас який можна використовувати у конструкції try-with-resources.

package lab3.task2;

import java.io.IOException;

public class TryWithResources {
    public static void main(final String[] args) {

        try (final File f1 = new File(); final File f2 = new File()) {
            f1.read();
        } catch (final IOException e) {
            System.out.println("catch IOException !!!!");
        }
    }

}
