package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String firstName;
    private String lastName;

}
