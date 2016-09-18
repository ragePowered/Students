package com;

// Напишіть програму “Першокурсники”:
// В програмі мають бути створені класи: студенти, професор, групи (за бажанням класи можна додавати);
// Дизайн класів (їх поля, відповідальність, взаємозв’язки) - також Ваша задача;
// Студенти повинні вміти обрати Старосту за особистими якостями одногрупників (правила відбору визначаєте Ви). Програма повинна виводити Старосту групи в консоль;
// Професор має вміти провести перекличку та визначити, чи всі студенти присутні (результат виводиться в консоль);
// Набір студентів, груп та професорів може бути заданий за замовчуванням (можна захардкодити);
// Приділіть увагу правилам ООП;
// Не забудьте прикласти інструкцію користувача до виконаного завдання.

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Professor teacher = new Professor("Ted Smith", 92);
    private static List<Student> students = new ArrayList<Student>() {{
        add(new Student("Edward Levis", 68));
        add(new Student("Ian Johnson", 80));
        add(new Student("Stan Baldwin", 75));
    }};
    private static StudentsGroup group = new StudentsGroup();

    public static void main(String[] args) {
        group.gatherGroup(students);
        group.assignTeacher(teacher);
        teacher.callOver();
        teacher.callCaptain();
    }
}
