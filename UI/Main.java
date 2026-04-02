package UI;

import Application.IssueBookService;
import Adapters.InMemoryBookRepository;
import Adapters.InMemoryStudentRepository;
import Domain.Book;
import Domain.Student;

public class Main {
    public static void main(String[] args) {

        InMemoryBookRepository bookRepo = new InMemoryBookRepository();
        InMemoryStudentRepository studentRepo = new InMemoryStudentRepository();

        bookRepo.add(new Book("1", "Clean Code", 1));
        studentRepo.add(new Student("1", "Ivan"));

        IssueBookService service = new IssueBookService(bookRepo, studentRepo);

        try {
            service.issueBook("1", "1");
            System.out.println("Книгу видано!");
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
