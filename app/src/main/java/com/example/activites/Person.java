package com.example.activites;

import java.io.Serializable;

import lombok.Data;

@Data
public class Person  implements Serializable {
    private String name;
    private int age;
}
