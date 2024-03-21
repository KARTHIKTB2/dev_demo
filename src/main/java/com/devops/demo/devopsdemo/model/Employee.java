package com.devops.demo.devopsdemo.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Employee implements Serializable {

    public Integer Id;
    public String fistName;
    public String lastName;
    public Integer age;
    public String address;
    public Integer pinCode;
    public String state;

}
