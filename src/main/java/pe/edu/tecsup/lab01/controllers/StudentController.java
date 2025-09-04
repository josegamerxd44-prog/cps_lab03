public class StudentController {

    public void controller() {
        System.out.println("Controlando estudiantes...");
    }

    public void showStudent(String name) {
        System.out.println("Mostrando información del estudiante: " + name);
    }

    public void addStudent(String name) {
        System.out.println("Estudiante agregado: " + name);
    }

    public void deleteStudent(String name) {
        System.out.println("Estudiante eliminado: " + name);
    }
}
