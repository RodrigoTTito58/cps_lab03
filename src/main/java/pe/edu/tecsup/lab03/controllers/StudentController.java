package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService = new StudentService();

    public void agregarEstudiante(Long id, String nombre, String apellido, String correo) {
        StudentEntity student = new StudentEntity(id, nombre, apellido, correo);
        studentService.registrarEstudiante(student);
        System.out.println("Estudiante agregado: " + nombre + " " + apellido);
    }

    public void mostrarEstudiantes() {
        List<StudentEntity> lista = studentService.listarEstudiantes();
        for (StudentEntity s : lista) {
            System.out.println("ID: " + s.getId() + " - " + s.getNombre() + " " + s.getApellido());
        }
    }
}