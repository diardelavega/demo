package mar.cod.ctrl;

import mar.cod.model.Student;
import mar.cod.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Control {

    @Autowired
    private StudentService ss;

    @RequestMapping("/hello")
    public String hello() {
        return "HELLO";
    }

    //    @RequestMapping("/hello")
    @GetMapping("/allstudents")
    public List<Student> getAllStudents() {
        return ss.getAllStudents();
    }

    @GetMapping("/idstudent/{id}")
    public Optional<Student> getStudent(@PathVariable("id") int id) {
        return ss.getStudent(id);
    }

    @PostMapping(value = "/newstudent", consumes  = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addUser(@RequestBody Student student) {
        Integer savStud = ss.addUser(student);
        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    @DeleteMapping("/delstudent/{id}")
    public Boolean delete(@PathVariable("id") Integer id) {
        return    ss.delete(id);
    }

    public List<Student> getByAverage(Float f) {
//        sr.deleteById(id);
        return null;
    }

}
