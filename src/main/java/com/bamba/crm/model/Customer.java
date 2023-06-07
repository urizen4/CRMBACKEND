package com.bamba.crm.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Costumer")
@Data
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "firstname",nullable = false, length = 50)
   private String firstname;

   @Column(name = "lastname",nullable = false, length = 50)
   private String lastname;

   @Column(name = "email",nullable = false, length = 50)
   private String email;

   @Column(name = "telephone",nullable = false, length = 50)
   private Long telephone;

   @Column(name = "company",nullable = false, length = 50)
   private String company;

}
