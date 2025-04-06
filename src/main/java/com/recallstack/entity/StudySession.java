package com.recallstack.entity;  

import jakarta.persistence.*;  
import java.time.LocalDate;  

@Entity  
public class StudySession {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    private LocalDate date = LocalDate.now();  
    private int cardsReviewed;  
    private double accuracy;  // Calculated as (correctAttempts / totalAttempts)  

    // Getters/setters  
}  