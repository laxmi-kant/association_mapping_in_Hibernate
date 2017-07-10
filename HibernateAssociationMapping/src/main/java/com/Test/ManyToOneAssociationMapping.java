package com.Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.topics.Person;
import com.topics.Phone;

public class ManyToOneAssociationMapping {

	public static void main(String[] args) {
		Session session=HibernateConfig.getSession();
		Transaction tx= session.beginTransaction();
		Person person = new Person();
		session.persist( person );

		Phone phone = new Phone( );
		phone.setPerson( person );
		session.persist( phone );

		session.flush();
//		phone.setPerson( null );
		System.out.println("Mapping successfull");
	}

}
