package com.topics;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AddressManyToManyUniderectional {
	@Id
	@GeneratedValue
	private Long id;
	
	private String street;
	
	private 	String postalCode;
	@ManyToMany(mappedBy="addressManyToManyUniderectional")
	private List<PersonManyToManyUniderectional> manyToManyUniderectional;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public List<PersonManyToManyUniderectional> getManyToManyUniderectional() {
		return manyToManyUniderectional;
	}
	public void setManyToManyUniderectional(List<PersonManyToManyUniderectional> manyToManyUniderectional) {
		this.manyToManyUniderectional = manyToManyUniderectional;
	}
	
}
