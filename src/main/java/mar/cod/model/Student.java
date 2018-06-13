package mar.cod.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Float average;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TITLE_ID")
    private Thesis thesisFK;


    public Student() {
    }

    public Student(String name, Float average, Thesis thesisFK) {
        this.name = name;
        this.average = average;
        this.thesisFK = thesisFK;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }


    public Thesis getThesisFK() {
        return thesisFK;
    }

    public void setThesisFK(Thesis thesisFK) {
        this.thesisFK = thesisFK;
    }
}

