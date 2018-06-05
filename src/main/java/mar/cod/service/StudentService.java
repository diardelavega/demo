package mar.cod.service;

import mar.cod.model.Student;
import mar.cod.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo sr;

    public List<Student> getAllStudents(){
        return sr.findAll();
    }

    public Optional<Student> getStudent(int id){
        return sr.findById(id);
    }
    public void addUser(Student userRecord){
        sr.save(userRecord);
    }
    public void delete(Integer id){
        sr.deleteById(id);
    }

    public List<Student> getByAverage(Float f){
//        sr.deleteById(id);
        return null;
    }
}
