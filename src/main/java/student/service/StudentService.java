package student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.entity.StudentEntity;
import student.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repoRef;

	public List<StudentEntity> getAllStudents() {
	List<StudentEntity> students = repoRef.findAll();
		return students;
	}

	public StudentEntity getStudentById(Long id) {
		StudentEntity student = null;
		Optional<StudentEntity> opt = repoRef.findById(id);
		if (opt != null) {
			student = opt.get();
		}
		return student;
	}

	public void deleteStudentById(Long id) {
		repoRef.deleteById(id);
	}

	public String deleteAllStudents() {
		repoRef.deleteAll();
		return "The details of all Students Deleted";
	}

	public String addStudent(StudentEntity newStudent) {
		StudentEntity student=new StudentEntity();
		student.setStudentName(newStudent.getStudentName());
		student.setStudentAddress(newStudent.getStudentAddress());
		student.setGender(newStudent.getGender());
		student.setAge(newStudent.getAge());
		student.setPhoneNumber(newStudent.getPhoneNumber());
		repoRef.save(student);
		return "A new Student Added";
	}
	
	public String updateStudentDetails(Long id,StudentEntity updatedStu) {
		StudentEntity student = null;
		Optional<StudentEntity> opt = repoRef.findById(id);
		if (opt != null) {
			student = opt.get();
			student.setStudentName(updatedStu.getStudentName());
			student.setPhoneNumber(updatedStu.getPhoneNumber());
			student.setStudentAddress(updatedStu.getStudentAddress());
			student.setAge(updatedStu.getAge());
			student.setGender(updatedStu.getGender());
			repoRef.save(student);
			return "student details updated sucessfully";
		}
		return "We cant find the Student with the ID you provided";
	}
}
