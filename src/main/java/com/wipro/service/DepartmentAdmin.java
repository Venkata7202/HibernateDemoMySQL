package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Department;

import static java.lang.System.*;

public class DepartmentAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Department deptObj=new Department(531,"Mahesh","RAJAMPET");
		session.save(deptObj);
		transaction.commit();
		out.println("Record Inserted");
		out.println(deptObj);
		session.close();
	}

}
