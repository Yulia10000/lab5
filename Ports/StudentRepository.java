package Ports;

import Domain.Student;

public interface StudentRepository {
    Student getStudentById(String id);
    void updateStudent(Student student);
}
