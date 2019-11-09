package com.beniregev.streamsapi.model;

import lombok.*;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private int salary;
    private boolean active;

    public String getFullName() {
        return this.getFirstName() + ' ' + this.getLastName();
    }
}
