package com.example.municipalServices.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private String nationalId;
    private String phoneNo;
    private String email;
    private String address;
    private LocalDate dateApplied;
    private String status;

    @ManyToOne
    @JoinColumn(name = "huduma_id") // Foreign key for Huduma
    private Huduma huduma;

    @ManyToOne
    @JoinColumn(name = "bill_id") // Foreign key for Bill
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "payment_id") // Foreign key for Payment
    private Payment payment;

    // Constructors
    public Applicant() {}

    public Applicant(Long id, String fullname, String nationalId, String phoneNo, String email, String address, LocalDate dateApplied, String status, Huduma huduma, Bill bill, Payment payment) {
        this.id = id;
        this.fullname = fullname;
        this.nationalId = nationalId;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.dateApplied = dateApplied;
        this.status = status;
        this.huduma = huduma;
        this.bill = bill;
        this.payment = payment;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.dateApplied = dateApplied;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Huduma getHuduma() {
        return huduma;
    }

    public void setHuduma(Huduma huduma) {
        this.huduma = huduma;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
