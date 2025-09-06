package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService = new StudentService();

    public void registrarEstudiante(Long id, String nombre, String correo) {
        studentService.registrarEstudiante(id, nombre, correo);
        System.out.println("✅ Estudiante registrado con éxito");
    }

    public void mostrarEstudiantes() {
        List<StudentEntity> estudiantes = studentService.listarEstudiantes();
        System.out.println("📋 Lista de estudiantes:");
        for (StudentEntity e : estudiantes) {
            System.out.println(e);
        }
    }

    public void mostrarEstudiantes() {
        List<StudentEntity> estudiantes = studentService.listarEstudiantes();
        System.out.println("📋 Lista de estudiantes:");
        for (StudentEntity e : estudiantes) {
            System.out.println(e);
        }
    }

    public void buscarEstudiante(Long id) {
        StudentEntity estudiante = studentService.buscarPorId(id);
        if (estudiante != null) {
            System.out.println("🔍 Estudiante encontrado: " + estudiante);
        } else {
            System.out.println("⚠️ Estudiante con ID " + id + " no encontrado.");
        }
    }

    public void eliminarEstudiante(Long id) {
        if (studentService.eliminarEstudiante(id)) {
            System.out.println("🗑️ Estudiante eliminado con éxito.");
        } else {
            System.out.println("⚠️ No se encontró estudiante con ID " + id);
        }
    }

    public void actualizarCorreo(Long id, String nuevoCorreo) {
        if (studentService.actualizarCorreo(id, nuevoCorreo)) {
            System.out.println("✉️ Correo actualizado correctamente.");
        } else {
            System.out.println("⚠️ No se pudo actualizar, estudiante no encontrado.");
        }
    }
}
