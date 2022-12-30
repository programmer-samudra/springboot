package home.springboot.learning.student;

import java.time.LocalDate;
public record Student(int id, String name, int age, LocalDate dob, String email) {
}
