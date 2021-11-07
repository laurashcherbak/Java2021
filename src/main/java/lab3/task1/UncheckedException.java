//Завдання № 1.
//Створити unchecked exception, одним із полів якого повинен бути enum із значеннями кодів (200, 400, 500 - стандартні HTTP коди). Створити клас Address та клас User (клас Address є полем класу User, клас User повинен мати щонайменше 5 полів) Створити метод validate(...), який буде перевіряти усі поля класу User
//на коректність заповнення.
//У разі некоректного (невалідного) значення потрібно створити виключну ситуацію.
//У звіті потрібно вказати які саме правила були використані для валідації. Наприклад:
//● Поле firstName - непорожнє, не повинне містити чисел та пробілів
//Мета цього завдання симулювати один із етапів реєстрації користувача, а саме - перевірку усіх заповнених полів.

package lab3.task1;

public class UncheckedException {
    public static void main(final String[] args) {
        final String firstName = "Ivan";
        final String lastName = "Ivanov1Ivan3ov";

        try {
            final User user = new User(firstName, lastName, 20, "ivan@gmail.com", "Ukraine, Lviv");
        } catch(final UserException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());

        }
    }
}
