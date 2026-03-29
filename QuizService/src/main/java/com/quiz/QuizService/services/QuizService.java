package com.quiz.QuizService.services;

import java.util.List;

import com.quiz.QuizService.entities.Quiz;

public interface QuizService {

	Quiz add(Quiz quiz);

	List<Quiz> get();

	Quiz get(Long id);

}
