package com.websecurity.demo.jwt.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
public class User implements UserDetails {

    @Id
    @GeneratedValue
    Integer id;
    @Column(nullable = false)
    String username;
    String lastname;
    String firstname;
    String country;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
}
