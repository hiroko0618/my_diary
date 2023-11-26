package com.diary.hiroko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.diary.hiroko.entity.Diary;
import com.diary.hiroko.repository.DiaryRepository;

@Service
public class DiaryService {
	
	@Autowired
	private DiaryRepository repository;
	
	@GetMapping
	public List<Diary> getAll() {
		return repository.findAll();
	}
}