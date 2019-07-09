package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import classes.struke.Doktor;
import classes.struke.Programer;
import classes.struke.SezonskiRadnik;
import classes.struke.Struka;

public class Poslodavac extends Adresa {
	private List<Radnik> radnici = new ArrayList<Radnik>();
	
	private String ime;
	private Struka struka;
	
	public Poslodavac(String ime, Struka struka, String broj, String ulica, String grad) {
		this.ime = ime;
		this.struka = struka;
		this.setBroj(broj);
		this.setUlica(ulica);
		this.setGrad(grad);
	}
	
	public Poslodavac(String ime, Struka struka) {
		this.ime = ime;
		this.struka = struka;
	}

	public List<Radnik> getRadnici() {
		return radnici;
	}

	public void setRadnici(List<Radnik> radnici) {
		this.radnici = radnici;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Struka getStruka() {
		return struka;
	}

	public void setStruka(Struka struka) {
		this.struka = struka;
	}
	
	public void zaposli(Radnik r) {
		if( r.getZanimanje().getClass().getName() == struka.getClass().getName() ) {
			radnici.add(r);
			r.setZaposlen(true);
			dajPlatu(r);
		} else System.out.println("Radnik nije odgovarajuce struke");
	}
	
	public void dajOtkaz(Radnik r) {
		r.setZaposlen(false);
		radnici.remove(r);
	}
	
	public void dajPlatu(Radnik r) {
		int plata = 0;
		if(struka instanceof Programer) plata = ThreadLocalRandom.current().nextInt(10, 101);
		else if(struka instanceof Doktor) plata = ThreadLocalRandom.current().nextInt(400, 2001);
		else if(struka instanceof SezonskiRadnik) plata = ThreadLocalRandom.current().nextInt(3, 8);
		//provera da li je radnik zaposlen kod datog poslodavca
		for(Radnik rad : radnici) if(rad == r) r.setPlata(plata);
	}

	@Override
	public String vratiAdresu() {
		return "Adresa poslodavca je : " + this.getUlica() + " " + this.getBroj() + ", " + this.getGrad();
	}
	
	
}
