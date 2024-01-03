package com.example.annotation;

import com.example.annotation.anno.Book;
import com.example.annotation.bean.Human;
import com.example.annotation.bean.Person;
import com.example.annotation.bean.Person2;
import com.example.annotation.pojo.BookStore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class DemoAnnotationApplicationTests {
    @Autowired
    Person person;
    @Autowired
    Person2 person2;
    @Autowired
    Human human;

    // 读取bean属性
    @Value("#{person.name}")
    private String name;
    // 读取bean属性
    @Value("#{person.age}")
    private String age;

    @Test
    void contextLoads0() {
        System.out.println("常量注入获取name为：" + name);
        System.out.println("常量注入获取age为：" + age);

    }

    @Test
    void contextLoads() {
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }

    @Test
    void contextLoads2() {
        System.out.println(person2.getName());
        System.out.println(person2.getAge());

    }
    @Test
    void contextLoads3() {
        System.out.println(human);

    }
    @Test
    void contextLoads4() {
        // 获得BookStore类对应的Class对象
        Class c = BookStore.class;
        // 判断BookStore类是否使用了Book注解
        if(c.isAnnotationPresent(Book.class)) {
            // 根据注解Class对象获取注解对象
            Book book = (Book) c.getAnnotation(Book.class);
            // 输出book注解属性值
            System.out.println("书名：" + book.value());
            System.out.println("价格：" + book.price());
            System.out.println("作者：" + Arrays.toString(book.authors()));
        }
    }
}
