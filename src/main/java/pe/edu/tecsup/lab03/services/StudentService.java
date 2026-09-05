package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public List<StudentEntity> listarEstudiantes() {
        return studentRepository.findAll();
    }

    public StudentEntity registrarEstudiante(StudentEntity student) {
        return studentRepository.save(student);
    }

    public StudentEntity buscarPorId(Long id) {
        return studentRepository.findById(id);
    }
}