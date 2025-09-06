package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<StudentEntity> estudiantes = new ArrayList<>();

    public void save(StudentEntity student) {
        estudiantes.add(student);
    }

    public List<StudentEntity> findAll() {
        return estudiantes;
    }

    public StudentEntity findById(Long id) {
        return estudiantes.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteById(Long id) {
        return estudiantes.removeIf(s -> s.getId().equals(id));
    }

    public boolean updateEmail(Long id, String nuevoCorreo) {
        StudentEntity estudiante = findById(id);
        if (estudiante != null) {
            estudiante.setCorreo(nuevoCorreo);
            return true;
        }
        return false;
    }
}
