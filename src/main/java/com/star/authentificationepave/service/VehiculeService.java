package com.star.authentificationepave.service;

import com.star.authentificationepave.models.Vehicule;

public interface VehiculeService {
	public  Vehicule addvehicule ( Vehicule vehicule);
	public  Vehicule getvehiculebyid (long id);
	public void deleteVehicule ( Vehicule vehicule);


}
