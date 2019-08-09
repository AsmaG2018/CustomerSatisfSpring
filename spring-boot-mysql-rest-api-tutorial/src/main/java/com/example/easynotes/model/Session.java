package com.example.easynotes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.easynotes.model.Agent;
import com.example.easynotes.model.Customer;


@Entity
@Table(name = "Session")
public class Session {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idSession;
	private String Name;
	private int Rate;
	private float Positive;
	private float Negative;
	private float Neutral;
	private Date DateSession;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idAgent")
	private Agent agent;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCustomer")
	private Customer customer;	

		
	public Session() {
		super();
	}
	public Session(long idSession, String name, int rate, float positive, float negative, float neutral,
			Date dateSession) {
		super();
		this.idSession = idSession;
		Name = name;
		Rate = rate;
		Positive = positive;
		Negative = negative;
		Neutral = neutral;
		DateSession = dateSession;
	}
	public long getIdSession() {
		return idSession;
	}
	public void setIdSession(long idSession) {
		this.idSession = idSession;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
	public float getPositive() {
		return Positive;
	}
	public void setPositive(float positive) {
		Positive = positive;
	}
	public float getNegative() {
		return Negative;
	}
	public void setNegative(float negative) {
		Negative = negative;
	}
	public float getNeutral() {
		return Neutral;
	}
	public void setNeutral(float neutral) {
		Neutral = neutral;
	}
	public Date getDateSession() {
		return DateSession;
	}
	public void setDateSession(Date dateSession) {
		DateSession = dateSession;
	}
	

}
