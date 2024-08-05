package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.entity.Student;
import com.project.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("addStd")
	public Student addStudent(@RequestBody Student student) {	
		return studentService.addStudent(student);
	}
	
	@PostMapping("{std_id}/enroll/{sub_id}")
	public Student enrollStdInSub(@PathVariable Integer std_id, @PathVariable Integer sub_id) {
		return studentService.enrollStdInSub(std_id, sub_id);
	}
	
	@GetMapping("/getAllStd")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/getSingleStd/{std_id}")
	public Student getStudentById(@PathVariable Integer std_id) {
		return studentService.getStudentById(std_id);
	}
	
	@DeleteMapping("/deleteStd/{std_id}")
	public String deleteStudent(@PathVariable Integer std_id) {
		return studentService.deleteStudent(std_id);
	}
	
}
