package mar.cod.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lesson {
    @Id @GeneratedValue
    private  Long id;

    private String lecturer;

//    @OneToMany(mappedBy = "")
//    private Long studentId;


}
