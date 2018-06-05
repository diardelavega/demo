package mar.cod.repo;

import mar.cod.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer>{
//    @Query("SELECT s FROM STUDENT s WHERE s.average>5 and s.average<8");
//   List<Student> findAveregeRange(Float from, Float to);

}
