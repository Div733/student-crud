package student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import student.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Long> {

}
