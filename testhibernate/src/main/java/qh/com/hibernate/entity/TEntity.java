package qh.com.hibernate.entity;

import java.util.Objects;

public class TEntity {
    private String uuid;
    private String a;
    private String b;

    public String getUuid() {
        return uuid;
    }

    public TEntity setUuid(String uuid) {
        this.uuid = uuid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TEntity tEntity = (TEntity) o;
        return Objects.equals(uuid, tEntity.uuid) &&
                Objects.equals(a, tEntity.a) &&
                Objects.equals(b, tEntity.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, a, b);
    }
}
