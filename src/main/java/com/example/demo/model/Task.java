package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status; // Например, "Pending", "In Progress", "Completed"
    private LocalDateTime createdAt;

    // Автоматически устанавливает текущую дату при создании
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
