package Ganzenbord.Vakjes;

import Ganzenbord.Speler;

public class Vakje {
	int vaknummer;

	public Vakje(int nummer){
		this.vaknummer = nummer;
	}

	@Override
	public String toString() {
		return "("+vaknummer+")";
	}

	public void actieOpSpeler(Speler speler) {
		return;
	}
}
