package Ganzenbord.Vakjes;

import Ganzenbord.Speler;
import Ganzenbord.Vakjes.Vakje;

public class EindVakje extends Vakje {

	public EindVakje(int nummer) {
		super(nummer);
	}

	@Override
	public String toString(){
		return super.toString() + "\tEind";
	}

	@Override
	public void actieOpSpeler(Speler speler) {
		speler.setGefinisht(true);
	}
}
