package com.jdc.ttw.jpql.services;

import java.util.List;

import com.jdc.ttw.jpql.Customer;

public class DynamicQueryServices extends JpaFactory {
	
	public List<Customer> find_by_customer_name_with_sql(String firstname){
		var em = emf.createEntityManager();
		var query = em.createNativeQuery("select * from customer_tbl where firstName like ?",Customer.class);
		query.setParameter(1, firstname.concat("%"));
		return query.getResultList();		
		
	}

}
