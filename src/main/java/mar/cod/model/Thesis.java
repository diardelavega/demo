package mar.cod.model;

import javax.persistence.*;

@Entity
public class Thesis {
    @Id
    private String title;
    private Integer pages;

//    @OneToOne(mappedBy = "thesisFK")
    @OneToOne
    @JoinColumn(name = "thesisFK")
    private Student student_Id;

    public Thesis() {
    }

//    public Thesis(String title, Integer pages, Student student_Id) {
//        this.title = title;
//        this.pages = pages;
//        this.student_Id = student_Id;
//    }

    public Thesis(String title, Integer pages) {
        this.title = title;
        this.pages = pages;
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

    @Override
    public String toString() {
        return "Thesis{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
//                ", student_Id=" + student_Id +
                '}';
    }
}
