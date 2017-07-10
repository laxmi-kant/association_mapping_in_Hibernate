package com.topics;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PersonOneToManyBiderectional {
	@Id
    @GeneratedValue
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PhoneOneToManyBiderectional> phones = new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<PhoneOneToManyBiderectional> getPhones() {
		return phones;
	}
	public void setPhones(List<PhoneOneToManyBiderectional> phones) {
		this.phones = phones;
	}

}
