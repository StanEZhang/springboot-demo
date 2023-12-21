package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName class1
 */
@Data
public class Class1 implements Serializable {
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