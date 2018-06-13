package mar.cod.repo;

import mar.cod.model.Thesis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThesisRepo extends JpaRepository<Thesis,Long> {
}
