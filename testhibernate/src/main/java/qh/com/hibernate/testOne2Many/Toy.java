package qh.com.hibernate.testOne2Many;

/**
 * 这里多态选择使用一张表，子类型用discriminator来区分。在父类设置一个逻辑主键。
 */
public class Toy {
    String toyID;
    String name;
    String description;

    public String getToyID() {
        return toyID;
    }

    public Toy setToyID(String toyID) {
        this.toyID = toyID;
        return this;
    }

    public String getName() {
        return name;
    }

    public Toy setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Toy setDescription(String description) {
        this.description = description;
        return this;
    }
}
