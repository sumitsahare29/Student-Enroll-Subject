package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Subject;
import com.project.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("/addSub")
	public Subject addSubject(@RequestBody Subject subject) {
		return subjectService.addSubject(subject);
	}
	
	@GetMapping("/getAllSub")
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}
	
	
}
