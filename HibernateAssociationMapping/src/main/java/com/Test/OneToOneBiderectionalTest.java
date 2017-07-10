package com.Test;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.topics.PhoneDetails;
import com.topics.PhoneDetailsOneToOneUniderectional;
import com.topics.PhoneOneToOneBiderectional;
import com.topics.PhoneUniderectional;

public class OneToOneBiderectionalTest {
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
				   .addProperties(prop).addAnnotatedClass(PhoneOneToOneBiderectional.class).addAnnotatedClass(PhoneDetailsOneToOneUniderectional.class)
				   .buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
public static void main(String []args){
	Session session=concreteSessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	try{
		PhoneOneToOneBiderectional phoneDetails=new PhoneOneToOneBiderectional();
		phoneDetails.setNumber("89829839283");
		PhoneDetailsOneToOneUniderectional many=new PhoneDetailsOneToOneUniderectional();
		many.setProvider("sdsdsds");;
		many.setTechnology("kllkllkllkl");;
		phoneDetails.setDetails(many);;
		session.save(phoneDetails);
		transaction.commit();
	}catch(Exception e){
		System.out.println(e);
	}finally{
		session.close();
	}

}
}
