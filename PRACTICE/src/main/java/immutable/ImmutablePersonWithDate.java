package immutable;

import java.util.Date;

/*
Клас має бути final – це забороняє успадкування, запобігаючи зміні поведінки класу через наслідування.

Всі поля мають бути приватними і final – це дозволяє ініціалізувати їх лише один раз, коли створюється об’єкт.

Не надавати сеттерів – не створювати методів, які можуть змінити значення полів.

Забезпечити захист від змін об’єктів – якщо клас містить посилання на змінні об'єкти (наприклад, List або Date),
потрібно повернути їх копії в геттерах, щоб зовнішній код не міг їх змінити.
*/

public final class ImmutablePersonWithDate {
    private final String name;
    private final Date birthDate;

    public ImmutablePersonWithDate(String name, Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime()); // Створення копії
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime()); // Повернення копії
    }
}