package com.camoleo.basicsocialmediaapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "comment")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String creatorsName;
    private LocalDate createdAt;
    private boolean like;
}
