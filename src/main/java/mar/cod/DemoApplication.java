package mar.cod;

import mar.cod.model.Student;
import mar.cod.model.Thesis;
import mar.cod.repo.ThesisRepo;
import mar.cod.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication


public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ThesisRepo tr;

    @Autowired
    private StudentService ss;

    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
        SpringApplication sa = new SpringApplication(DemoApplication.class);
        sa.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------: HUA");

        Thesis t1 = new Thesis("Thesis 1", 80);
        Thesis t2 = new Thesis("Thesis 2", 89);

		Optional<Student> s1 = ss.getStudent(1);
		Optional<Student> s2 = ss.getStudent(22);
		s1.get().setThesisFK(t1);
		s2.get().setThesisFK(t2);

        tr.save(t1);
        tr.save(t2);

        ss.updateStudent(s1.get());
        ss.updateStudent(s2.get());

        t1.setStudent_Id(s1.get());
        t2.setStudent_Id(s2.get());
        tr.save(t1);
        tr.save(t2);


        for(Thesis t:tr.findAll())
          System.out.println( t.toString());
//		System.exit(0);
    }
}
