package com.example.reflection;

import com.example.reflection.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;

@SpringBootTest
class DemoReflectionApplicationTests {

    @Test
    void contextLoads() throws ClassNotFoundException {
        User user = new User();
        Class<? extends User> u1 = user.getClass();
        System.out.println(u1.getName());
        System.out.println(u1.hashCode());

        Class<User> u2 = User.class;
        System.out.println(u2.hashCode());

        Class<?> u3 = Class.forName("com.example.reflection.pojo.User");
        System.out.println(u3.hashCode());
    }
    @Test
    void contextLoad2() throws ClassNotFoundException {
        Class<?> u = Class.forName("com.example.reflection.pojo.User");
        System.out.println(u.getName());
        System.out.println(u.getSimpleName());
        System.out.println(u.getCanonicalName());
        System.out.println(u.getPackage());

        Class<String> s = String.class;
        System.out.println(s.getName());
        System.out.println(s.getSimpleName());
        System.out.println(s.getCanonicalName());
        System.out.println(s.getPackage());
    }
    @Test
    void contextLoad3() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> u = Class.forName("com.example.reflection.pojo.User");
        System.out.println("=====getFields=====");
        Field[] fields = u.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("=====getDeclaredFields=====");
        Field[] declaredFields = u.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        System.out.println("=====getField=====");
        System.out.println(u.getField("address"));
        System.out.println("=====getFields=====");
        System.out.println(u.getDeclaredField("name"));

    }
}
