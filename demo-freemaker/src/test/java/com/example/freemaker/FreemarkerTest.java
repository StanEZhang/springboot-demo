package com.example.freemaker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest(classes = DemoFreemakerApplication.class)
public class FreemarkerTest {

    @Autowired
    private Configuration configuration;

    @Test
    public void test() throws IOException, TemplateException {
        //freemarker的模板对象，获取模板
        Template template = configuration.getTemplate("news.ftl");
        Map params = getData();
        //合成
        //第一个参数 数据模型
        //第二个参数  输出流
        template.process(params, new FileWriter("d:/news.html"));
    }

    private Map getData() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("title", "特别就业季：稳就业情况如何? 哪些问题待解?");
        map.put("source", "人民日报");
        map.put("pubTime", new Date());
        map.put("content", "中共中央政治局常务委员会近日召开会议强调，" +
                "要有针对性地开展援企、稳岗、扩就业工作，" +
                "做好高校毕业生、农民工等重点群体就业工作，" +
                "积极帮助个体工商户纾困。疫情期间，稳就业情况如何？还有哪些问题待解？" +
                "记者采访了不同群体，记录这个特别的就业季。");
        //返回Map
        return map;
    }
}