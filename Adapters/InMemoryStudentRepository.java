package Adapters;

import java.util.HashMap;
import java.util.Map;
import Domain.Student;
import Ports.StudentRepository;

public class InMemoryStudentRepository implements StudentRepository {

    private Map<String, Student> students = new HashMap<>();

    public Student getStudentById(String id) {
        return students.get(id);
    }

    public void updateStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void add(Student student) {
        students.put(student.getId(), student);
    }
}
