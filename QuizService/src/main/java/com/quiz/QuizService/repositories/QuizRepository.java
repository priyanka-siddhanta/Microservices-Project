package com.quiz.QuizService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.QuizService.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
