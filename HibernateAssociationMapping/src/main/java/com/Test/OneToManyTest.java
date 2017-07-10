package com.Test;

import java.util.ArrayList;

import javax.persistence.OneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.OneToManyConfig;
import com.topics.PersonOneToMany;
import com.topics.PhoneOneToMany;

public class OneToManyTest {

	public static void main(String[] args) {
		Session session=OneToManyConfig.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			PersonOneToMany personOneToMany=new PersonOneToMany();
			
			
			PhoneOneToMany many=new PhoneOneToMany();
//			many.setId(1l);
			many.setNumber("8888888");
			PhoneOneToMany many1=new PhoneOneToMany();
//			many.setId(3l);
			many.setNumber("8888887");
			PhoneOneToMany many2=new PhoneOneToMany();
//			many.setId(2l);
			many.setNumber("8888886");
			PhoneOneToMany many3=new PhoneOneToMany();
//			many.setId(4l);
			many.setNumber("8888885");
			PhoneOneToMany many4=new PhoneOneToMany();
//			many.setId(5l);
			many.setNumber("8888884");
			PhoneOneToMany many5=new PhoneOneToMany();
//			many.setId(6l);
			many.setNumber("8888883");
			
			ArrayList<PhoneOneToMany> list=new ArrayList<>();
			list.add(many5);
			list.add(many);
			list.add(many1);
			list.add(many2);
			list.add(many3);
			list.add(many4);
			personOneToMany.setPhones(list);
			session.persist(personOneToMany);
			transaction.commit();
		}catch(Exception e){
			System.out.println(e);
		}finally{
			session.close();
		}
	}

}
