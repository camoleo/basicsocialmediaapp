package com.camoleo.basicsocialmediaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;


@SpringBootApplication
public class BasicsocialmediaappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicsocialmediaappApplication.class, args);
    }

}
