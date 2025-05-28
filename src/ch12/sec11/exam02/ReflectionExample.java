package ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class<Car> c = Car.class;

        Constructor<?>[] constructors = c.getDeclaredConstructors();

        for (var constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class<?>[] types = constructor.getParameterTypes();
            printParameters(types);
            System.out.println(")");

        }

        System.out.println();
        Field[] fields = c.getDeclaredFields();

        for (var field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }

        System.out.println();
        Method[] methods = c.getDeclaredMethods();

        for (var method : methods) {
            System.out.print(method.getName() + "(");
            Class<?>[] types = method.getParameterTypes();
            printParameters(types);
            System.out.println(")");
        }

    }

    private static void printParameters(Class<?>[] types) {
        for (var type : types) {
            System.out.print(type.getName());
            System.out.print(",");
        }
    }
}
