package com.Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.OneToOneUniderectionalConfig;
import com.topics.PhoneDetails;
import com.topics.PhoneUniderectional;

public class OneToOneUniderectionalTest {

	public static void main(String[] args) {
		Session session=OneToOneUniderectionalConfig.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			PhoneDetails phoneDetails=new PhoneDetails();
			phoneDetails.setId(1L);
			phoneDetails.setTechnology("sdsds");
			phoneDetails.setProvider("dsdsdsdsd");
			PhoneUniderectional many=new PhoneUniderectional();
			many.setId(1L);
			many.setNumber("fensta");
			many.setDetails(phoneDetails);
			session.save(many);
			transaction.commit();
		}catch(Exception e){
			System.out.println(e);
		}finally{
			session.close();
		}

	}

}
