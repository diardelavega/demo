package mar.mysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Odds {

    @Id
    @GeneratedValue
    private Long mid;
    //full time
    private Float _1= new Float(1.0);
    private Float _x= new Float(1.0);
    private Float _2= new Float(1.0);
    private Float _01= new Float(1.0);
    private Float _23= new Float(1.0);
    private Float _46= new Float(1.0);
    private Float _7p= new Float(1.0);
    private Float _gg= new Float(1.0);
    private Float _ng= new Float(1.0);

    //half time
    private Float _ht1= new Float(1.0);
    private Float _htx= new Float(1.0);
    private Float _ht2= new Float(1.0);
    private Float _ht01= new Float(1.0);
    private Float _ht2p= new Float(1.0);
    private Float _htgg= new Float(1.0);
    private Float _htng= new Float(1.0);

    //half full time
    private Float _11= new Float(1.0);
    private Float _1x= new Float(1.0);
    private Float _12= new Float(1.0);
    private Float _21= new Float(1.0);
    private Float _2x= new Float(1.0);
    private Float _22= new Float(1.0);
    private Float _x1= new Float(1.0);
    private Float _xx= new Float(1.0);
    private Float _x2= new Float(1.0);

    private Float _t1mt2= new Float(1.0);//t1 Score more t2 Score
    private Float _t1lt2= new Float(1.0);//t1 Score less t2 Score
    private Float _t1st2= new Float(1.0);//t1 Score same t2 Score




    public Odds() {
    }

    public Odds(Float _1, Float _x, Float _2, Float _01, Float _23, Float _46, Float _7p, Float _gg, Float _ng, Float _ht1, Float _htx, Float _ht2, Float _ht01, Float _ht2p, Float _htgg, Float _htng, Float _11, Float _1x, Float _12, Float _21, Float _2x, Float _22, Float _x1, Float _xx, Float _x2, Float _t1mt2, Float _t1lt2, Float _t1st2) {
        this._1 = _1;
        this._x = _x;
        this._2 = _2;
        this._01 = _01;
        this._23 = _23;
        this._46 = _46;
        this._7p = _7p;
        this._gg = _gg;
        this._ng = _ng;
        this._ht1 = _ht1;
        this._htx = _htx;
        this._ht2 = _ht2;
        this._ht01 = _ht01;
        this._ht2p = _ht2p;
        this._htgg = _htgg;
        this._htng = _htng;
        this._11 = _11;
        this._1x = _1x;
        this._12 = _12;
        this._21 = _21;
        this._2x = _2x;
        this._22 = _22;
        this._x1 = _x1;
        this._xx = _xx;
        this._x2 = _x2;
        this._t1mt2 = _t1mt2;
        this._t1lt2 = _t1lt2;
        this._t1st2 = _t1st2;
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

    public Float get_01() {
        return _01;
    }

    public void set_01(Float _01) {
        this._01 = _01;
    }

    public Float get_23() {
        return _23;
    }

    public void set_23(Float _23) {
        this._23 = _23;
    }

    public Float get_46() {
        return _46;
    }

    public void set_46(Float _46) {
        this._46 = _46;
    }

    public Float get_7p() {
        return _7p;
    }

    public void set_7p(Float _7p) {
        this._7p = _7p;
    }

    public Float get_gg() {
        return _gg;
    }

    public void set_gg(Float _gg) {
        this._gg = _gg;
    }

    public Float get_ng() {
        return _ng;
    }

    public void set_ng(Float _ng) {
        this._ng = _ng;
    }

    public Float get_ht1() {
        return _ht1;
    }

    public void set_ht1(Float _ht1) {
        this._ht1 = _ht1;
    }

    public Float get_htx() {
        return _htx;
    }

    public void set_htx(Float _htx) {
        this._htx = _htx;
    }

    public Float get_ht2() {
        return _ht2;
    }

    public void set_ht2(Float _ht2) {
        this._ht2 = _ht2;
    }

    public Float get_ht01() {
        return _ht01;
    }

    public void set_ht01(Float _ht01) {
        this._ht01 = _ht01;
    }

    public Float get_ht2p() {
        return _ht2p;
    }

    public void set_ht2p(Float _ht2p) {
        this._ht2p = _ht2p;
    }

    public Float get_htgg() {
        return _htgg;
    }

    public void set_htgg(Float _htgg) {
        this._htgg = _htgg;
    }

    public Float get_htng() {
        return _htng;
    }

    public void set_htng(Float _htng) {
        this._htng = _htng;
    }

    public Float get_11() {
        return _11;
    }

    public void set_11(Float _11) {
        this._11 = _11;
    }

    public Float get_1x() {
        return _1x;
    }

    public void set_1x(Float _1x) {
        this._1x = _1x;
    }

    public Float get_12() {
        return _12;
    }

    public void set_12(Float _12) {
        this._12 = _12;
    }

    public Float get_21() {
        return _21;
    }

    public void set_21(Float _21) {
        this._21 = _21;
    }

    public Float get_2x() {
        return _2x;
    }

    public void set_2x(Float _2x) {
        this._2x = _2x;
    }

    public Float get_22() {
        return _22;
    }

    public void set_22(Float _22) {
        this._22 = _22;
    }
}
