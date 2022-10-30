package com.ramana.accounts.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class Customer implements Serializable {
    @Id
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "aadhar_number")
    private Long aadharNumber;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "created_date")
    private LocalDate createdDate;

}
