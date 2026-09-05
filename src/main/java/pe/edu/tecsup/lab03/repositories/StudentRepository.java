package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<StudentEntity> students = new ArrayList<>();

    public List<StudentEntity> findAll() {
        return students;
    }

    public StudentEntity save(StudentEntity student) {
        students.add(student);
        return student;
    }

    public StudentEntity findById(Long id) {
        for (StudentEntity s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
}