package com.mavenproject2.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mavenproject2.jdbc.dao.StudentDao;
import com.mavenproject2.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject2/jdbc/config.xml");
        
    	/* Without XML */
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        /* Insert the data */
//        Student student = new Student();
//        student.setId(8);
//        student.setName("Om");
//        student.setCity("banaras");
//        
//        int result = studentDao.insert(student);
//        System.out.println("Students added " + result);
        
      /* Update the data */
//      Student student = new Student();
//      student.setId(2);
//      student.setName("Shivam");
//      student.setCity("prayagraj");
//      int result = studentDao.change(student);
//      System.out.println("Data changed " + result);
    
        /* Delete */
//        studentDao.delete(6);
//        studentDao.delete(5);
//        int result = studentDao.delete(4);
//        System.out.println("Data deleted " + result);
    	
        /* select single data (Row mapper) */
        Student student =  studentDao.getStudent(1);
        System.out.println(student);
        
        List<Student> students = studentDao.getAllStudents();
        
        for(Student s : students){
        	System.out.println(s);
        }
        
        
    }
}
