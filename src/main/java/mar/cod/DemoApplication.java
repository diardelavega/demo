package mar.cod;

import mar.cod.model.Lesson;
import mar.cod.model.Student;
import mar.cod.model.Thesis;
import mar.cod.repo.ThesisRepo;
import mar.cod.repo.LessonRepo;
import mar.cod.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@SpringBootApplication


public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ThesisRepo tr;

    @Autowired
    private StudentService ss;

    @Autowired
    private LessonRepo lr;


    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
        SpringApplication sa = new SpringApplication(DemoApplication.class);
        sa.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------: HUA");

//        Thesis t1 = new Thesis("Thesis 1", 80);
//        Thesis t2 = new Thesis("Thesis 2", 89);

		Optional<Student> s1 = ss.getStudent(1);
		Optional<Student> s2 = ss.getStudent(22);
//		s1.get().setThesisFK(t1);
//		s2.get().setThesisFK(t2);
//
//        tr.save(t1);
//        tr.save(t2);
//
//        ss.updateStudent(s1.get());
//        ss.updateStudent(s2.get());
//
//        t1.setStudent_Id(s1.get());
//        t2.setStudent_Id(s2.get());
//        tr.save(t1);
//        tr.save(t2);


//        for(Thesis t:tr.findAll())
//          System.out.println( t.toString());

        System.out.println( "\n\n\n ---------------------");
        System.out.println( " Many to Many");

        List<Student> stlist= new ArrayList<Student>();
        List<Lesson> llist= new ArrayList<Lesson>();

        stlist.add(s1.get());
        stlist.add(s2.get());
        Lesson l1 =new Lesson("Profesor1",stlist);
        llist.add(l1);
        s1.get().setLessons(llist);
        s2.get().setLessons(llist);
        ss.updateStudent(s1.get());
        ss.updateStudent(s2.get());
//        lr.save(l1);

//        for(Lesson l :lr.findAll()) {
//            System.out.println(l.toString());
//            s1.get().getLessons().add(l);
//        }
//        System.out.println( "Student ....: ");
//        System.out.println(s1.get().toString());
//        System.out.println( "Update student ....: ");
//        ss.updateStudent(s1.get());
//        System.out.println( "re read student ....: ");
//        Optional<Student> temp = ss.getStudent(s1.get().getId());
//        System.out.println( "print Student ....: ");
//        System.out.println(temp.get().toString());


        /*System.out.println( "Adding Students to lessons ....: ");
        for(Lesson l :lr.findAll()) {
            l.getStudents().add(s1.get());
            l.getStudents().add(s2.get());
            System.out.println( l.toString());
            lr.save(l);
        }*/

       /* System.out.println( "re read lessons ....: ");
        for(Lesson l :lr.findAll()) {
            System.out.println( l.toString());
        }*/




    }
}
