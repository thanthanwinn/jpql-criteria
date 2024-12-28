package com.jdc.ttw.jpql;

import java.util.List;

import javax.annotation.processing.Generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_tbl")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 45)
	private String firstName;
	
	@Column(nullable = false, length = 45)
	private String lastName;
	
	@Min(value = 1)
	@Max(value = 100)
	@Column(nullable = false)
	private int age;
	
	@OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY, mappedBy = "customer")
	private List<Address> address;

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}
	
	
	

}
