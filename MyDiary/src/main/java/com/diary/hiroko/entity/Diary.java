package com.diary.hiroko.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Diary")
public class Diary {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "title")
	private Integer title;
	
	@Column(name = "content")
	private Integer content;
	
	@Column(name = "update_date")
	private Integer date;
}