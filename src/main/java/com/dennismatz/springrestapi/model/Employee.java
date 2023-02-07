package com.dennismatz.springrestapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@ToString
@Data
@Entity(name = "tbl_employee")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name should not be null")
    @Column(name = "name")
    private String name;

//    @NotNull
    @Column(name = "age")
    private Long age = 0L;

    @NotBlank(message = "Location should not be null")
    @Column(name = "location")
    private String location;

    @Email(message = "Enter a valid email")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "Department should not be null")
    @Column(name = "department")
    private String department;

    @CreationTimestamp
    @Column(name = "createdAt", nullable = false, updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt",nullable = false, updatable = true)
    private Date updatedAt;
}
