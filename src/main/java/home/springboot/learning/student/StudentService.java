package home.springboot.learning.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentService {
    public Student getStudent() {
        return new Student(10, "Samudra", 40, LocalDate.of(1983, 1, 2), "samudrasen@gmail.com");
    }
}
