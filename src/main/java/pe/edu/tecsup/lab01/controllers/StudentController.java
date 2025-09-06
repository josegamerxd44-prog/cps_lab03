package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> listar() {
        return studentService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Student> buscarPorId(@PathVariable Long id) {
        return studentService.buscarPorId(id);
    }

    @PostMapping
    public Student guardar(@RequestBody Student student) {
        return studentService.guardar(student);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        studentService.eliminar(id);
    }
}
