package com.recallstack.entity;  

import jakarta.persistence.*;  
import java.time.LocalDate;  

@Entity  
public class Flashcard {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    private String question;  
    private String answer;  
    private String tag;  
    private LocalDate nextReviewDate = LocalDate.now();  
    private int intervalDays = 1;  
    private int correctAttempts = 0;  // Added for active recall tracking  
    private int totalAttempts = 0;    // Added for active recall tracking  

    // Getters and setters (generate these in VS Code with Right-click > Source Action)  
    // Or use Lombok later to simplify  
}  