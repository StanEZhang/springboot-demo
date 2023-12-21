package com.haibin.test.beanUtils;

import com.alibaba.fastjson.JSON;
import com.haibin.test.beanUtils.pojo.Father;
import com.haibin.test.beanUtils.pojo.Life;
import com.haibin.test.beanUtils.pojo.Son;
import org.springframework.beans.BeanUtils;

/**
 * @project: test-demo
 * @className: BeanUtilsTest
 * @description:
 * @author: zhanghaibin
 * @create: 2023-06-26
 */
public class BeanUtilsTest {
    public static void main(String[] args) {
        Father cuishan = new Father();
        cuishan.setHeight("180");
        cuishan.setName("cuishan");
        Life cuishanLife = new Life();
        cuishanLife.setStatus("alive");
        cuishan.setLife(cuishanLife);
        Son wuji=new Son();
        // spring自带的
        BeanUtils.copyProperties(cuishan, wuji);

       Life wujiLife = wuji.getLife();
       wujiLife.setStatus("alive");
       wuji.setLife(wujiLife);
        wuji.setFace("ok");
       cuishanLife.setStatus("dead"); // 翠山后来自刎了

        System.out.println(JSON.toJSONString(cuishan));
        System.out.println(JSON.toJSONString(wuji));
    }

}
