package com.ayshriv.linkmindbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="contacts")
@Entity(name ="contact")
public class Contact extends BaseEntity {

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;
    @Column(length = 1000)
    private String description;
    private boolean favorite = false;
    private String websiteLink;
    private String linkedInLink;
    private String instagramLink;
    private String cloudinaryImagePublicId;

    @ManyToOne
    private User user;
}
