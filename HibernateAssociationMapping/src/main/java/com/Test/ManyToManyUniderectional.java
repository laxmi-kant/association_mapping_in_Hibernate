package com.Test;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.topics.AddressManyToManyUniderectional;
import com.topics.PersonManyToManyUniderectional;
import com.topics.PhoneDetailsOneToOneUniderectional;
import com.topics.PhoneOneToOneBiderectional;

public class ManyToManyUniderectional {
	private static final SessionFactory concreteSessionFactory;
	static {
		try {
			Properties prop= new Properties();
			prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
			prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/Test?useSSL=false");
			prop.setProperty("hibernate.connection.username", "root");
			prop.setProperty("hibernate.connection.password", "root");
			prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			prop.setProperty("hibernate.hbm2ddl.auto", "create");
			prop.setProperty("hibernate.show_sql", "true");
			prop.setProperty("hibernate.format_sql", "false");
			concreteSessionFactory = new Configuration()
		   .addPackage("com.topics")
				   .addProperties(prop).addAnnotatedClass(PersonManyToManyUniderectional.class).addAnnotatedClass(AddressManyToManyUniderectional.class)
				   .buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String[] args){
		Session  session=concreteSessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		try{
			PersonManyToManyUniderectional manyToManyUniderectional=new PersonManyToManyUniderectional();
			AddressManyToManyUniderectional addressManyToManyUniderectional=new AddressManyToManyUniderectional();
		}catch(Exception exception){
			System.out.println(exception);
		}finally{
			session.close();
		}
	}
}
