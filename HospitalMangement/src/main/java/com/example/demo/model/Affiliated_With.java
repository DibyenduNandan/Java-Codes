package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Affiliated_With {
	
	@EmbeddedId
	private Affiliated_Composite id=new Affiliated_Composite();
	
	

	@Column(nullable = false)
	private boolean primaryAffiliation;

	public Affiliated_Composite getId() {
		return id;
	}

	public void setId(Affiliated_Composite id) {
		this.id = id;
	}

	public boolean isPrimaryAffiliation() {
		return primaryAffiliation;
	}

	public void setPrimaryAffiliation(boolean primaryAffiliation) {
		this.primaryAffiliation = primaryAffiliation;
	}
	
	public Physician setPhysician() {
		return getId().getPhysician();
	}
	
	

}
