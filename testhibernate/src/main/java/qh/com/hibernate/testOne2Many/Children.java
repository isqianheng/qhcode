package qh.com.hibernate.testOne2Many;

import java.time.LocalDate;
import java.util.Set;

public class Children {
    Long id;
    String name;
    LocalDate birthday;
    Set<Toy> toys;

    public Long getId() {
        return id;
    }

    public Children setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Children setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Children setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public Set<Toy> getToys() {
        return toys;
    }

    public Children setToys(Set<Toy> toys) {
        this.toys = toys;
        return this;
    }
}
