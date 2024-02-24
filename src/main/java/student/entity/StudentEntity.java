package student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentid;
	private String studentName;
	private String studentAddress;
	private String gender;
	private int age;
	private String phoneNumber;
	
	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(Long studentid, String studentName, String studentAddress, String gender, int age,
			String phoneNumber) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentid=" + studentid + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + ", gender=" + gender + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
