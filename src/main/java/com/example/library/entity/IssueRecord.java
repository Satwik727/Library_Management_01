package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
public class IssueRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate issueDate;
    private LocalDate returnDate;

    @ManyToOne
    private Book book;

    @ManyToOne
    private User user;
}
