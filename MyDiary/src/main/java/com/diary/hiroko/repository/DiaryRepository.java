package com.diary.hiroko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diary.hiroko.entity.Diary;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, String> {
	
}