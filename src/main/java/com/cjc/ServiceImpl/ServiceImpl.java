package com.cjc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DaoI.DaoI;
import com.cjc.ServiceI.ServiceI;
@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	DaoI di;
	

}
