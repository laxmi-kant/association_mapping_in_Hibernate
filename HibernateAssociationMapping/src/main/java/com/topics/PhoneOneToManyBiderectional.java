package com.topics;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PhoneOneToManyBiderectional {
	@Id
    @GeneratedValue
    private Long id;

    @Column(name = "`number`")

    private String number;
    @ManyToOne
    private PersonOneToManyBiderectional biderectional;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PersonOneToManyBiderectional getBiderectional() {
		return biderectional;
	}
	public void setBiderectional(PersonOneToManyBiderectional biderectional) {
		this.biderectional = biderectional;
	}
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) {
            return true;
        }
        if ( obj == null || getClass() != obj.getClass() ) {
            return false;
        }
        PhoneOneToManyBiderectional phone = (PhoneOneToManyBiderectional) obj;
        return Objects.equals( number, phone.number );
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
