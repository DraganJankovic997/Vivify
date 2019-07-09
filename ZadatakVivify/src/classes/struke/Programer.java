package classes.struke;

import classes.Radnik;

public class Programer implements Struka {

	@Override
	public int isplata(Radnik r) {
		
		//racunao sam da programer radi ili 8h dnevno, ili ne radi taj dan, pocetni broj radnih dana za svaki mesec je 30
		return r.getPlata() * r.getBrojRadnihDana() * 8;
	}

	
	
}
