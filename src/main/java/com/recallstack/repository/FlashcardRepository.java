package com.recallstack.repository;  

import com.recallstack.entity.Flashcard;  
import org.springframework.data.jpa.repository.JpaRepository;  
import java.time.LocalDate;  
import java.util.List;  

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {  
    // Custom query to find due flashcards  
    List<Flashcard> findByNextReviewDateLessThanEqual(LocalDate date);  
}  