package mar.cod.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Float average;

    @OneToOne
    @JoinColumn(name = "TITLE_ID")
    private Thesis thesisFK;

    @ManyToMany
    Collection<Lesson> lessons=null;


    public Student() {
    }

    public Student(String name, Float average, Thesis thesisFK) {
        this.name = name;
        this.average = average;
        this.thesisFK = thesisFK;
    }

    public Student(String name, Float average, Thesis thesisFK, Collection<Lesson> lessons) {
        this.name = name;
        this.average = average;
        this.thesisFK = thesisFK;
        this.lessons = lessons;
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

    public Collection<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Collection<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", average=" + average +
                ", thesisFK=" + thesisFK +
                ", lessons=" + (lessons != null ? lessons : null) +
                '}';
    }
}

