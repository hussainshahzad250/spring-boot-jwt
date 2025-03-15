package com.hussain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "EMAIL_CONFIG")
public class EmailConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String host;
    private int port;
    private String username;
    private String password;
    private String protocol;
}
