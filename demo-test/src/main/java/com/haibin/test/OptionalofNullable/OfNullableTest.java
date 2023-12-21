package com.haibin.test.OptionalofNullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @project: test-demo
 * @className: OfNullable
 * @description:
 * @author: zhanghaibin
 * @create: 2023-06-28
 */
public class OfNullableTest {
    public static void main(String[] args) {
        List<String> list = null;
        // list.forEach(x -> System.out.println(x));
        List<String> newList = Optional.ofNullable(list).orElse(new ArrayList());
        newList.forEach(System.out::println);

    }

}
