package qh.com.hibernate.testOne2Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class T {
    Session session=null;
    Transaction transaction=null;

    @org.junit.Test
    public void saveMap() {
        System.out.println("--------------------");
        Children child = new Children();
        ToyCat cat = new ToyCat();
        ToyDog dog = new ToyDog();
        cat.setMiao("miao").setName("tomCat").setDescription("tom猫");
        dog.setWang("wang").setName("dog").setDescription("狗");
        Set<Toy> toys = new HashSet<>();
        toys.add(cat);
        toys.add(dog);
        child.setName("Bob").setBirthday(LocalDate.now()).setToys(toys);
//        session.save(cat); //使用了cascade="all" 级联，否则需要显式保存子表才能保存主表
//        session.save(dog);
        session.save(child);



    }

    @org.junit.Before
    public void setUp() throws Exception {
        Configuration configuration = new Configuration();
        configuration.configure("qh/com/hibernate/testOne2Many/hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        session = factory.openSession();
        transaction = session.getTransaction();
        transaction.begin();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        transaction.commit();
        session.close();
    }


}