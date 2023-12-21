package com.haibin.test.reflectionTest;

import java.lang.reflect.Field;

/**
 * @project: test-demo
 * @className: FieldComparisonDemo
 * @description: 通过反射对比并找出两个对象中不一样的属性，可以打印属性名和属性值
 * @author: zhanghaibin
 * @create: 2023-07-05
 */
public class FieldComparisonDemo {
    public static void main(String[] args) {
        Person originalPerson = new Person("John", 30);
        Person modifiedPerson = new Person("John", 40);

        compareObjects(originalPerson, modifiedPerson);
    }

    private static void compareObjects(Object originalObj, Object modifiedObj) {
        Class<?> clazz = originalObj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object originalValue = field.get(originalObj);
                Object modifiedValue = field.get(modifiedObj);

                if (!originalValue.equals(modifiedValue)) {
                    System.out.println("Field '" + field.getName() + "' has been modified.");
                    System.out.println("Modified value: " + modifiedValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
