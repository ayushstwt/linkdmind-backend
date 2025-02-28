package com.ayshriv.linkmindbackend.entities;

import com.ayshriv.linkmindbackend.enums.Providers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "users")
@Entity(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseEntity{

    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private String password;
    @Lob
    private String about;
    @Column(length = 1000)
    private String profilePicture;
    private String phoneNumber;
    private String address;
    private boolean emailVerified=false;
    private boolean phoneVerified=false;

    @Enumerated(value = EnumType.STRING)
    private Providers provider=Providers.SELF;
    private String emailToken;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Contact> contacts=new LinkedHashSet<>();
}
