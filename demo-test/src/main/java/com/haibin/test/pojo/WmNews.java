package com.haibin.test.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 自媒体图文内容信息表
 * </p>
 *
 * @author itheima
 */
@Data
public class WmNews implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * task参数
     */
    private byte[] parameters;

    /**
     * 自媒体用户ID
     */
    private Integer userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 图文内容
     */
    private String content;

    /**
     * 封面布局方式
            0 无图文章
            1 单图文章
            3 多图文章
     */
    private Integer type;

    /**
     * 图文频道ID
     */
    private Integer channelId;

    private String labels;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 提交时间
     */
    private Date submitedTime;

    /**
     * 当前状态
     0 草稿
     1 提交（待自动审核）
     2 审核失败（自动审核失败或人工审核失败）
     3 待人工审核
     4 人工审核通过
     8 自动审核通过（待发布）
     9 已发布
     */
    private Integer status;

    /**
     * 文章定时发布时间
     */
    private Date publishTime;

    /**
     * 拒绝理由
     */
    private String reason;

    /**
     * APP端文章ID
     */
    private Long articleId;

    /**
     * 图片地址，多个图片地址用逗号拼接
     */
    private String images;

    /**
     * 0-未上架 1-已上架
     */
    private Integer enable;
    
     //状态枚举类
    public enum Status{
        NORMAL(0),SUBMIT(1),FAIL(2),ADMIN_AUTH(3),ADMIN_SUCCESS(4),SUCCESS(8),PUBLISHED(9);
        Integer code;
        Status(Integer code){
            this.code = code;
        }
        public Integer getCode(){
            return this.code;
        }
    }

}