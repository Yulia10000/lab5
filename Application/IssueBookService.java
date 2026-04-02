package Application;

import Domain.Book;
import Domain.Student;
import Ports.BookRepository;
import Ports.StudentRepository;

public class IssueBookService {

    private BookRepository bookRepo;
    private StudentRepository studentRepo;

    public IssueBookService(BookRepository bookRepo, StudentRepository studentRepo) {
        this.bookRepo = bookRepo;
        this.studentRepo = studentRepo;
    }

    public void issueBook(String studentId, String bookId) {
        Student student = studentRepo.getStudentById(studentId);
        Book book = bookRepo.getBookById(bookId);

        if (!student.canTakeBook()) {
            throw new RuntimeException("Студент не може взяти більше книг");
        }

        if (!book.canBeIssued()) {
            throw new RuntimeException("Книга недоступна");
        }

        book.issue();
        student.takeBook();

        bookRepo.updateBook(book);
        studentRepo.updateStudent(student);
    }
}
