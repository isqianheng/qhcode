package qh.com.hibernate.entity;

import java.util.Objects;

public class TEntity {
    private Long tid;
    private String a;
    private String b;

    public Long getTid() {
        return tid;
    }

    public TEntity setTid(Long tid) {
        this.tid = tid;
        return this;
    }

    public String getA() {
        return a;
    }

    public TEntity setA(String a) {
        this.a = a;
        return this;
    }

    public String getB() {
        return b;
    }

    public TEntity setB(String b) {
        this.b = b;
        return this;
    }
}
