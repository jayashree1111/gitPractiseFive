package com.cjc.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.DaoI.DaoI;
@Repository
public class DaoImpl implements DaoI {
	@Autowired
	 private SessionFactory sf;
	

}
