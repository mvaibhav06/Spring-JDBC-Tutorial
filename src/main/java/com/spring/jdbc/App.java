package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started....." );
        
        //spring jdbc => jdbcTemplate
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
		/*
		 * Student student = new Student(); student.setId(999); student.setName("John");
		 * student.setCity("Goa");
		 * 
		 * int result = studentDao.insert(student); System.out.println(result);
		 */
        
		/*
		 * Student student = new Student(); student.setId(222); student.setName("KCR");
		 * student.setCity("Hyderabad");
		 * 
		 * int change = studentDao.change(student); System.out.println(change);
		 */
        
        
       
		/*
		 * int r = studentDao.delete(222); System.out.println(r);
		 */
        
		/*
		 * Student student = studentDao.getStudent(999); System.out.println(student);
		 */
        
        System.out.println(studentDao.getAllStudents());
    }
}
