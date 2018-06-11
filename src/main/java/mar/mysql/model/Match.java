package mar.mysql.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "NEW_MATCH")
public class Match {
    @Id
    @GeneratedValue
    private Long mid;
    private Integer compId;
    private String t1;
    private String t2;
    private Integer ft1;
    private Integer ft2;
    private Integer ht1;
    private Integer ht2;

    private LocalDate dat;
    private LocalTime time;

    @OneToOne
    private Odds odd;

    public Match() {
    }

    public Match(Integer compId, String t1, String t2, Integer ft1, Integer ft2, Integer ht1, Integer ht2, LocalDate dat, LocalTime time, Odds odd) {
        this.compId = compId;
        this.t1 = t1;
        this.t2 = t2;
        this.ft1 = ft1;
        this.ft2 = ft2;
        this.ht1 = ht1;
        this.ht2 = ht2;
        this.dat = dat;
        this.time = time;
        this.odd = odd;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public Integer getFt1() {
        return ft1;
    }

    public void setFt1(Integer ft1) {
        this.ft1 = ft1;
    }

    public Integer getFt2() {
        return ft2;
    }

    public void setFt2(Integer ft2) {
        this.ft2 = ft2;
    }

    public Integer getHt1() {
        return ht1;
    }

    public void setHt1(Integer ht1) {
        this.ht1 = ht1;
    }

    public Integer getHt2() {
        return ht2;
    }

    public void setHt2(Integer ht2) {
        this.ht2 = ht2;
    }

    public LocalDate getDat() {
        return dat;
    }

    public void setDat(LocalDate dat) {
        this.dat = dat;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Odds getOdd() {
        return odd;
    }

    public void setOdd(Odds odd) {
        this.odd = odd;
    }
}
