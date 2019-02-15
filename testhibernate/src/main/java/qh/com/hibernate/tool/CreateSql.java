package qh.com.hibernate.tool;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import java.io.File;

public class CreateSql {
    public static void main(String[] args) {
        //获取加载配置管理类
        Configuration configuration = new Configuration();

        //不给参数就默认加载hibernate.cfg.xml文件，
        configuration.configure(new File("D:\\code\\qhcode\\testhibernate\\src\\main\\java\\hibernate.cfg.xml"));

        SchemaExport export = new SchemaExport();
　　　　　//是否生成sql语句，是否建表　　
        export.create();
    }
}
