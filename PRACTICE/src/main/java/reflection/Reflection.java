package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        try {
            // Отримання об'єкта Class
            Class<?> clazz = Class.forName("com.example.MyClass");

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method name: " + method.getName());


//                // Виклик методу за допомогою рефлексії
//                Method method = clazz.getDeclaredMethod("someMethod", String.class);
//                method.setAccessible(true); // Зняття обмеження доступу, якщо метод приватний
//                method.invoke(clazz.newInstance(), "parameter");

                // Доступ до поля і модифікація значення
//                Field field = clazz.getDeclaredField("someField");
//                field.setAccessible(true);
//                field.set(obj, "new value");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
