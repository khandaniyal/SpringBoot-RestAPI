package com.example.yuto.models;
import lombok.*;
import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String name;
    private String email;
    private int priority;


}
