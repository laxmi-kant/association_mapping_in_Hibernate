package com.topics;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PhoneDetailsOneToOneUniderectional {
	@Id
    @GeneratedValue
    private Long id;

    private String provider;

    private String technology;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="phoneDetails_id")
    private PhoneOneToOneBiderectional biderectional;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public PhoneOneToOneBiderectional getBiderectional() {
		return biderectional;
	}

	public void setBiderectional(PhoneOneToOneBiderectional biderectional) {
		this.biderectional = biderectional;
	}
    
    
}
