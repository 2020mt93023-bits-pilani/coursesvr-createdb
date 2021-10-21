package in.ac.bitspilani.assignment.ss.courseservice;

import in.ac.bitspilani.assignment.ss.courseservice.model.Course;
import in.ac.bitspilani.assignment.ss.courseservice.model.Subject;

import in.ac.bitspilani.assignment.ss.courseservice.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class CourseserviceApplication implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepository;


	public static void main(String[] args) {
		SpringApplication.run(CourseserviceApplication.class, args);

	}

	@Override
	public void run(String... args) {
		createCourseData();
	}

	private void createCourseData(){
		List<Subject> subjects = new ArrayList<>();
		Subject subject = new Subject(1, "Software Project Management", -1, false, true);
		subjects.add(subject);
		subject = new Subject(2, "Software Quality Management", -1, false, true);
		subjects.add(subject);
		subject = new Subject(3, "Scalable Services", -1, false, true);
		subjects.add(subject);
		subject = new Subject(4, "Blockchain Systens & Environment", -1, false, true);
		subjects.add(subject);
		subject = new Subject(5, "Introduction to DevOps", -1, false, true);
		subjects.add(subject);
		subject = new Subject(6, "Software Architecture", 1, true, true);
		subjects.add(subject);
		subject = new Subject(7, "Agile Methodologies", 1, true, true);
		subjects.add(subject);
		subject = new Subject(8, "Introduction to Cyber Security", -1, false, true);
		subjects.add(subject);
		subject = new Subject(9, "Software Testing", 2, true, true);
		subjects.add(subject);
		subject = new Subject(10, "Software Product Management", 2, true, true);
		subjects.add(subject);
		subject = new Subject(11, "Cross Platform Development", -1, false, true);
		subjects.add(subject);
		subject = new Subject(12, "Artificial Intelligence", -1, false, true);
		subjects.add(subject);
		subject = new Subject(13, "Machine Learning", -1, false, true);
		subjects.add(subject);
		subject = new Subject(14, "Secure Software Engineering", -1, false, true);
		subjects.add(subject);
		subject = new Subject(15, "Cloud Computing", -1, false, true);
		subjects.add(subject);
		subject = new Subject(34, "Middleware Technologies", -1, false, true);
		subjects.add(subject);

		Course course = new Course(1, "Software Engineering", subjects);
		courseRepository.save(course);

		subjects = new ArrayList<>();

		subject = new Subject(16, "Embedded System Design", -1, false, false);
		subjects.add(subject);
		subject = new Subject(17, "Cyber Physical Systems", -1, false, true);
		subjects.add(subject);
		subject = new Subject(18, "Database Design", 1, true, true);
		subjects.add(subject);
		subject = new Subject(19, "Data Mining", -1, false, true);
		subjects.add(subject);
		subject = new Subject(20, "Micro Processors", -1, false, false);
		subjects.add(subject);
		subject = new Subject(21, "Distributed Computing", 1, true, true);
		subjects.add(subject);
		subject = new Subject(22, "Deep Learning", -1, false, false);
		subjects.add(subject);
		subject = new Subject(23, "Natural Learning Process", -1, false, true);
		subjects.add(subject);
		subject = new Subject(24, "Embedded Network Security", -1, false, false);
		subjects.add(subject);
		subject = new Subject(25, "Data Management For IOT", -1, false, false);
		subjects.add(subject);
		subject = new Subject(26, "Network Embedded Applications", -1, false, false);
		subjects.add(subject);
		subject = new Subject(27, "Computer Networks", -1, false, true);
		subjects.add(subject);
		subject = new Subject(28, "Design and Operation of Data Centers", -1, false, false);
		subjects.add(subject);
		subject = new Subject(29, "Edge Computing", -1, false, true);
		subjects.add(subject);
		subject = new Subject(30, "Advanced Computer Networks", -1, false, true);
		subjects.add(subject);
		subject = new Subject(31, "Network Programming", -1, false, true);
		subjects.add(subject);
		subject = new Subject(32, "Network Security", -1, false, true);
		subjects.add(subject);
		subject = new Subject(33, "Wireless & Mobile Communication", -1, false, false);
		subjects.add(subject);
		subject = new Subject(35, "Mobile Networks", -1, false, true);
		subjects.add(subject);
		subject = new Subject(36, "Data Storage Technologies", -1, false, true);
		subjects.add(subject);
		subject = new Subject(37, "Cryptography", -1, false, true);
		subjects.add(subject);
		subject = new Subject(38, "Ethical Hacking", -1, false, true);
		subjects.add(subject);
		subject = new Subject(39, "Identity & Access Management Technologies", -1, false, true);
		subjects.add(subject);
		subject = new Subject(40, "Parallel Embedded Architectures", -1, false, false);
		subjects.add(subject);
		subject = new Subject(41, "Software For Embedded Systems", -1, false, true);
		subjects.add(subject);
		subject = new Subject(42, "Real Time Systems", -1, false, true);
		subjects.add(subject);
		subject = new Subject(43, "Data Structures", 1, true, true);
		subjects.add(subject);
		subject = new Subject(44, "Data Wearhousing", 2, true, true);
		subjects.add(subject);


		course = new Course(2, "Systems Software", subjects);
		courseRepository.save(course);
	}
}
