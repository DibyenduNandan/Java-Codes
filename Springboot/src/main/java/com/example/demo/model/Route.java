package com.example.demo.model;


import java.util.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="rote_map", joinColumns = @JoinColumn(name="Id"),inverseJoinColumns = 
//	@JoinColumn(name="stationId")
	@JsonManagedReference
	List <Station> station;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Station> getStation() {
		return station;
	}

	public void setStation(List<Station> station) {
		this.station = station;
	}

	
	
	
	
	
}
