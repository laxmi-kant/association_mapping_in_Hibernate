package com.topics;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "PhoneUniderectional")
public  class PhoneUniderectional {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "`number`")
    private String number;

    @OneToOne
    @JoinColumn(name = "details_id")
    private PhoneDetails details;

    public PhoneUniderectional() {
    }

    public PhoneUniderectional(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
        return number;
    }

    public PhoneDetails getDetails() {
        return details;
    }

    public void setDetails(PhoneDetails details) {
        this.details = details;
    }
}
