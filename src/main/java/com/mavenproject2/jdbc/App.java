package com.mavenproject2.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject2/jdbc/config.xml");
        
        // we need jdbc template object to use queries
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println("My program started" );
        // insert query
        String query = "insert into student(id,name,city) values(?,?,?)";
    
        // fire query
        int result = template.update(query, 7, "Ajay", "Patna");
        System.out.println("no of recorded inserted = " + result);
    }
}
