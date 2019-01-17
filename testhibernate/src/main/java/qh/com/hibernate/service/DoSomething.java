package qh.com.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import qh.com.hibernate.entity.TEntity;

import java.io.File;

public class DoSomething {
    public static void main(String[] args) {
        //创建对象
        TEntity t = new TEntity();
        t.setA("1a")
            .setB("1b")
            .setUuid("12314124123");

        //获取加载配置管理类
        Configuration configuration = new Configuration();

        //不给参数就默认加载hibernate.cfg.xml文件，
        configuration.configure(new File("D:\\code\\qhcode\\testhibernate\\src\\main\\java\\hibernate.cfg.xml"));

        //创建Session工厂对象
        SessionFactory factory = configuration.buildSessionFactory();

        //得到Session对象
        Session session = factory.openSession();

        //使用Hibernate操作数据库，都要开启事务,得到事务对象
        Transaction transaction = session.getTransaction();

        //开启事务
        transaction.begin();

        //把对象添加到数据库中
        session.save(t);

        //提交事务
        transaction.commit();

        //关闭Session
        session.close();
    }





}
