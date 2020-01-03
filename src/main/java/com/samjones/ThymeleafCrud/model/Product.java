package com.samjones.ThymeleafCrud.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Name cannot be blank.")
    private String name;
    @NotBlank(message="Brand cannot be blank.")
    private String brand;
    @NotNull(message="Price cannot be blank.")
    @Positive(message = "Number must be positive.")
    private Float price;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        if(createdAt==null){
            System.out.println("Created at is null");
            return;
        }
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
