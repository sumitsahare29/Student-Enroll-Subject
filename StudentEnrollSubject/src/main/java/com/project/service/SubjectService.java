package com.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.entity.Subject;
import com.project.repo.SubjectRepo;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepo subjectRepo;

	// add subject
	public Subject addSubject(Subject subject) {
		return subjectRepo.save(subject);
	}
	
	//read all subject
	public List<Subject> getAllSubjects() {
		return subjectRepo.findAll();
	}
}
