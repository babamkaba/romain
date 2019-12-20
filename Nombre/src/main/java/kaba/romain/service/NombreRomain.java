package kaba.romain.service;

import kaba.romain.enumeration.NombreEnumRomain;

public class NombreRomain implements INombreService {

	public String convertNombre(int nombre) {
		String result = "";
		for (NombreEnumRomain e : NombreEnumRomain.values()) {
			while (nombre >= e.getCode()) {
				result += e.name();
				nombre -= e.getCode();
			}
		}
		return result;
	}

	

}
