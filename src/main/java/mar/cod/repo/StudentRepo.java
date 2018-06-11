package mar.cod.repo;

import mar.cod.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
//    @Query("SELECT s FROM STUDENT s WHERE s.average>5 and s.average<8");
//   List<Student> findAveregeRange(Float from, Float to);

    public List<Student> findByAverageBetweenOrderById(Float from, Float to);
    public  List<Student> findByNameContaining(String name);

}
