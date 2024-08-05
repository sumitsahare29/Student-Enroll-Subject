package com.project.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.entity.Student;
import com.project.entity.Subject;
import com.project.repo.StudentRepo;
import com.project.repo.SubjectRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private SubjectRepo subjectRepo;

	//add student
	public Student addStudent(Student student) {	
		return studentRepo.save(student);
	}

	//student enroll the subject
	public Student enrollStdInSub(Integer std_id, Integer sub_id) {
		Optional<Student> opStudent = studentRepo.findById(std_id);
		Optional<Subject> opSubject = subjectRepo.findById(sub_id);

		if (opStudent.isPresent() && opSubject.isPresent()) {
			Student student = opStudent.get();
			student.getSubjects().add(opSubject.get());
			return studentRepo.save(student);
		} 
		else {
			throw new IllegalArgumentException("Student or Subject not found");
		}
	}

	//read all student
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	//read student by id
	public Student getStudentById(Integer std_id) {
		return studentRepo.findById(std_id).get();
	}
	
	//delete student
	public String deleteStudent(Integer std_id) {
		 studentRepo.deleteById(std_id);
		 return "Student deleted!";
	}
	
	

}
