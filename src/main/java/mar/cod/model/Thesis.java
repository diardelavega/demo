package mar.cod.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Thesis {
    @Id
    private String title;
    private Integer pages;

    @OneToOne(mappedBy = "thesisFK")
    private Student student_Id;

    public Thesis() {
    }

    public Thesis(String title, Integer pages, Student student_Id) {
        this.title = title;
        this.pages = pages;
        this.student_Id = student_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Student getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(Student student_Id) {
        this.student_Id = student_Id;
    }
}
