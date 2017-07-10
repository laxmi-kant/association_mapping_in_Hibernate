package com.topics;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PersonManyToManyUniderectional {
	@Id
	@GeneratedValue
    private Long id;
	
	private String aadharNumber;
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<AddressManyToManyUniderectional> addressManyToManyUniderectional;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public List<AddressManyToManyUniderectional> getAddressManyToManyUniderectional() {
		return addressManyToManyUniderectional;
	}
	public void setAddressManyToManyUniderectional(List<AddressManyToManyUniderectional> addressManyToManyUniderectional) {
		this.addressManyToManyUniderectional = addressManyToManyUniderectional;
	}
	
	
}
