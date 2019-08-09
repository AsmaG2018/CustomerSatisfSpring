package com.example.easynotes.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.example.easynotes.model.Session;
@Entity
public class Agent {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idAgent;
	
	@OneToMany(mappedBy="agent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Session> sessions;

	public Agent() {
		super();
	}



	public Agent(long idAgent) {
		super();
		this.idAgent = idAgent;
	}



	public long getIdAgent() {
		return idAgent;
	}



	public void setIdAgent(long idAgent) {
		this.idAgent = idAgent;
	}
	
	
	
	
}
