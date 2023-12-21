package com.example.httpclient.util;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @project: httpClient-demo
 * @className: WebUtil
 * @description:
 * @author: zhanghaibin
 * @create: 2023-05-22
 */
public class WebUtil {

    // 获取http请求
    private static HttpServletRequest getRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
        return request;
    }
}
