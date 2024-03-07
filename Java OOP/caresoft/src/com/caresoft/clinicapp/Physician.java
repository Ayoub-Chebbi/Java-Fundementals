package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	
	private ArrayList<String> patientNotes;

	public Physician(int id) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignPin(int pin) {
		if(pin>999 && pin<10000) {
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id == confirmedAuthID) {
			return true;
		}
		return false;
	}
	
}
