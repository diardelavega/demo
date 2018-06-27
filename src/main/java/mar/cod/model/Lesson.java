package mar.cod.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;
    private String lecturer;
    @ManyToMany( mappedBy = "lessons")
    Collection<Student> students=null;

    public Lesson() {
    }

    public Lesson(String lecturer, Collection<Student> students) {
        this.lecturer = lecturer;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", lecturer='" + lecturer + '\'' +
                ", students=" + (students == null ? null : students) +
                '}';
    }

}
