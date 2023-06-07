package com.bamba.crm.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
@Data
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",nullable = false,length = 50)
    private String username;

    @Column(name = "username",nullable = false,length = 50)
    private String password;

    @Column(name = "username",nullable = false,length = 50)
    private String firstname;

    @Column(name = "username",nullable = false,length = 50)
    private String lastname;

    @OneToMany
    @JoinColumn(name = "idCustomer")
    private List<Customer> customers;

}
