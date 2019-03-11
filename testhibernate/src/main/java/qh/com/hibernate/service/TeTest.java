package qh.com.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import static org.junit.Assert.*;

public class TeTest {
    Session session=null;
    Transaction transaction=null;

    @org.junit.Before
    public void setUp() throws Exception {
        //获取加载配置管理类
        Configuration configuration = new Configuration();

        //不给参数就默认加载hibernate.cfg.xml文件，注意maven中需要配置pom，在resources中抽取配置
        configuration.configure("hibernate.cfg.xml");

        //创建Session工厂对象
        SessionFactory factory = configuration.buildSessionFactory();

        //得到Session对象
        session = factory.openSession();

        //使用Hibernate操作数据库，都要开启事务,得到事务对象
        transaction = session.getTransaction();

        //开启事务
        transaction.begin();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("--------------------");

    }

    @org.junit.Test
    public void load() {
        session.close();
    }
}