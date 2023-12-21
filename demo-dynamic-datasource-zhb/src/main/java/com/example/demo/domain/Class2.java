package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName class2
 */
@Data
public class Class2 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    private static final long serialVersionUID = 1L;
}