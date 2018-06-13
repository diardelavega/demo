package mar.mysql.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="MATCHES")
public class OldMatch  {
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
    private Float _1;
    private Float _x;
    private Float _2;
    private Float _o;
    private Float _u;
    private Date dat;

    public OldMatch() {
    }

    public OldMatch(Integer compId, String t1, String t2, Integer ft1, Integer ft2, Integer ht1, Integer ht2, Float _1, Float _x, Float _2, Float _o, Float _u, Date dat) {
        this.compId = compId;
        this.t1 = t1;
        this.t2 = t2;
        this.ft1 = ft1;
        this.ft2 = ft2;
        this.ht1 = ht1;
        this.ht2 = ht2;
        this._1 = _1;
        this._x = _x;
        this._2 = _2;
        this._o = _o;
        this._u = _u;
        this.dat = dat;
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

    public Float get_1() {
        return _1;
    }

    public void set_1(Float _1) {
        this._1 = _1;
    }

    public Float get_x() {
        return _x;
    }

    public void set_x(Float _x) {
        this._x = _x;
    }

    public Float get_2() {
        return _2;
    }

    public void set_2(Float _2) {
        this._2 = _2;
    }

    public Float get_o() {
        return _o;
    }

    public void set_o(Float _o) {
        this._o = _o;
    }

    public Float get_u() {
        return _u;
    }

    public void set_u(Float _u) {
        this._u = _u;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }
}
