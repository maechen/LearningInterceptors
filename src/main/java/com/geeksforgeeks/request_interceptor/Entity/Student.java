package com.geeksforgeeks.request_interceptor.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    int id;
    String firstName;
    String lastName;
}
