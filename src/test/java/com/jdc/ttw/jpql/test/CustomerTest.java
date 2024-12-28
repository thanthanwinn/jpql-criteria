package com.jdc.ttw.jpql.test;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.ttw.jpql.services.DynamicQueryServices;

public class CustomerTest {
	
	 private static DynamicQueryServices d_query_services ;
	 
	 @BeforeAll
	static void init() {
		 d_query_services = new DynamicQueryServices();
	 }
	 
	 
	
	
	@ParameterizedTest
	@CsvSource("Mukesh")
	void find_by_cus_name(String firstName) {
		
		var using_sql = d_query_services.find_by_customer_name_with_sql(firstName);
		System.out.println(using_sql);
	}
	
	
	
	
	
	

}
