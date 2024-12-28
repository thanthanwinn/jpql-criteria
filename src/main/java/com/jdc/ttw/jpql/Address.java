package com.jdc.ttw.jpql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address_tbl")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 45)
	private String city;
	
	@Column(nullable = false, length = 45)
	private String street;
	
	@Column(columnDefinition = "int default 1")
	private int p_code;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", p_code=" + p_code + "]";
	}
	
	

	
	

}
