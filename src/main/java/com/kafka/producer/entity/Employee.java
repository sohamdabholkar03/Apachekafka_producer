package com.kafka.producer.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    private String employeeId;

    private String name;

    private LocalDate birthDate;
}
