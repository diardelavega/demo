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

    public List<Student> getAllStudents() {
        return sr.findAll();
    }

    public Optional<Student> getStudent(int id) {
        return sr.findById(id);
    }

    public Integer addUser(Student userRecord) {
        Student ret = sr.save(userRecord);
        return ret.getId();
    }

    public Boolean delete(Integer id) {
        try {
            sr.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Student> getByAverage(Float from, Float to) {
        return  sr.findByAverageBetweenOrderById(from, to);
    }

    public List<Student> getByName(String name) {
        List<Student> ret = sr.findByNameContaining(name);
        return ret;
    }
}
