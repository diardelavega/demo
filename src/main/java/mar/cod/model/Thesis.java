package mar.cod.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Thesis {
    @Id @GeneratedValue
    private String titleId;

    private String title;

    private Integer pages;

@OneToOne(mappedBy = "thesisFK")
    private Long studentId;

    public Thesis() {
    }

    public Thesis(String title, Integer pages, Long studentId) {
        this.title = title;
        this.pages = pages;
        this.studentId = studentId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
