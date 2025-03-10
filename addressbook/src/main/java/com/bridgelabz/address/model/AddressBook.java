package com.bridgelabz.address.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Table(name = "address_book")
@Data
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name not valid")
    @NotNull
    private String name;

    @NotNull(message = "Address should not be null")
    private String address;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Enter correct email address")
    private String email;

    @NotNull(message = "Department can't be empty")
    private String department;

    @DecimalMin(value = "500", message = "Minimum salary must be 500$")
    private Double salary;
}
