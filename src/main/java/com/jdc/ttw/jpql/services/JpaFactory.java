package com.jdc.ttw.jpql.services;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {
	public  EntityManagerFactory emf;
	
	
	{
		emf = Persistence.createEntityManagerFactory("jpql");
	}
	

}
