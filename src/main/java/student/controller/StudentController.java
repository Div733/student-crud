package student.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.entity.StudentEntity;
import student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService serviceRef;
	
	@PostMapping("/add-NewStudent")
	public String addStudent(@RequestBody StudentEntity newStudent) {
		return serviceRef.addStudent(newStudent);
	}
	
	@GetMapping("/get-OneStudent/{id}")
	public StudentEntity getOneStudent(@PathVariable("id") Long id) {
		return serviceRef.getStudentById(id);
	}
	
	@GetMapping("/get-AllStudents")
	public Collection<StudentEntity> getAllStudents(){
		return serviceRef.getAllStudents();
	}
	
	@DeleteMapping("/del-AllStudents")
	public String deleteAllStudents() {
		return serviceRef.deleteAllStudents();
	}
	
	@DeleteMapping("/del-OneStudents/{id}")
	public void deleteOneStudents(@PathVariable("id") Long id) {
		 serviceRef.deleteStudentById(id);
	}
	
	@PutMapping("/update-Student/{id}")
	public String updateStudentDetails(@RequestBody StudentEntity student,@PathVariable("id") Long id) {
		return serviceRef.updateStudentDetails(id, student);
	}

}
