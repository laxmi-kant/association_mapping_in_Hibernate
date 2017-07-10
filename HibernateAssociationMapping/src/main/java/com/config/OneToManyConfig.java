package com.config;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.topics.Person;
import com.topics.PersonOneToMany;
import com.topics.PersonOneToManyBiderectional;
import com.topics.Phone;
import com.topics.PhoneOneToMany;
import com.topics.PhoneOneToManyBiderectional;

public class OneToManyConfig {
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
				   .addProperties(prop).addAnnotatedClass(PersonOneToMany.class).addAnnotatedClass(PhoneOneToMany.class)
				   .addAnnotatedClass(PersonOneToManyBiderectional.class).addAnnotatedClass(PhoneOneToManyBiderectional.class)
				   .buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static Session getSession()
			throws HibernateException {
		return concreteSessionFactory.openSession();
	}
}
