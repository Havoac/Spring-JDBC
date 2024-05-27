package com.mavenproject2.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mavenproject2.jdbc.dao.StudentDao;
import com.mavenproject2.jdbc.dao.StudentDaoImpl;
import com.mavenproject2.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject2/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student();
        student.setId(8);
        student.setName("Om");
        student.setCity("banaras");
        
        int result = studentDao.insert(student);
        System.out.println("Students added " + result);
    }
}
