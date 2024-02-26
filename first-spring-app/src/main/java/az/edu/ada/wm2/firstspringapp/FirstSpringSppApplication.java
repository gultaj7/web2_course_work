package az.edu.ada.wm2.firstspringapp;

import az.edu.ada.wm2.firstspringapp.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstSpringSppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringSppApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						14125L,
						"Gultaj",
						"Muradova",
						20
				)
		);
	}
}
