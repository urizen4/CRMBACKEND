package com.bamba.crm.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name ="Invoice" )
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount",nullable = false)
    private Float amount;

    @Column(name="sendAt",nullable = false)
    private LocalDateTime sentAt;

    @ManyToOne
    @JoinColumn(name ="idCustomer")
    private Customer customer ;

 }
