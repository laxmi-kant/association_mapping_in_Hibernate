package com.Test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.OneToManyConfig;
import com.topics.PersonOneToMany;
import com.topics.PersonOneToManyBiderectional;
import com.topics.PhoneOneToMany;
import com.topics.PhoneOneToManyBiderectional;

public class OneToManyBiderectionalTest {

	public static void main(String[] args) {
		Session session=OneToManyConfig.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			PersonOneToManyBiderectional personOneToMany=new PersonOneToManyBiderectional();
			
			
			PhoneOneToManyBiderectional many=new PhoneOneToManyBiderectional();
//			many.setId(1l);
			many.setNumber("8888888");
			PhoneOneToManyBiderectional many1=new PhoneOneToManyBiderectional();
//			many.setId(3l);
			many.setNumber("8888887");
			PhoneOneToManyBiderectional many2=new PhoneOneToManyBiderectional();
//			many.setId(2l);
			many.setNumber("8888886");
			PhoneOneToManyBiderectional many3=new PhoneOneToManyBiderectional();
//			many.setId(4l);
			many.setNumber("8888885");
			PhoneOneToManyBiderectional many4=new PhoneOneToManyBiderectional();
//			many.setId(5l);
			many.setNumber("8888884");
			PhoneOneToManyBiderectional many5=new PhoneOneToManyBiderectional();
//			many.setId(6l);
			many.setNumber("8888883");
//			personOneToMany.getPhones().add(many1);
//			personOneToMany.getPhones().add(many);
//			personOneToMany.getPhones().add(many2);
//			personOneToMany.getPhones().add(many3);
//			personOneToMany.getPhones().add(many4);
//			personOneToMany.getPhones().add(many5);
			ArrayList<PhoneOneToManyBiderectional> list=new ArrayList<>();
			list.add(many5);
			list.add(many);
			list.add(many1);
			list.add(many2);
			list.add(many3);
			list.add(many4);
			personOneToMany.setPhones(list);
			session.save(personOneToMany);
			session.flush();
			transaction.commit();
		}catch(Exception e){
			System.out.println(e);
		}finally{
			session.close();
		}
	}

}
