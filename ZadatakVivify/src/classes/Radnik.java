package classes;

import classes.struke.Struka;

public class Radnik extends Adresa {

	private String ime, prezime;
	private int plata, brojRadnihDana;
	private boolean naOdmoru, zaposlen;
	private Struka zanimanje;
	
	public Radnik(String ime, String prezime, Struka zanimanje, boolean zaposlen) {
		this.ime = ime;
		this.prezime = prezime;
		this.zanimanje = zanimanje;
		this.zaposlen = zaposlen;
		this.brojRadnihDana = 30;
		this.naOdmoru = false;
		this.plata = 0;
	}
	
	public Radnik(String ime, String prezime, Struka zanimanje, boolean zaposlen, String broj, String ulica, String grad) {
		this.ime = ime;
		this.prezime = prezime;
		this.zanimanje = zanimanje;
		this.zaposlen = zaposlen;
		this.brojRadnihDana = 30;
		this.naOdmoru = false;
		this.plata = 0;
		
		this.setBroj(broj);
		this.setUlica(ulica);
		this.setGrad(grad);
	}
	

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

	public int getBrojRadnihDana() {
		return brojRadnihDana;
	}

	public void setBrojRadnihDana(int brojRadnihDana) {
		this.brojRadnihDana = brojRadnihDana;
	}

	public boolean isNaOdmoru() {
		return naOdmoru;
	}

	public void setNaOdmoru(boolean naOdmoru) {
		this.naOdmoru = naOdmoru;
	}

	public Struka getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(Struka zanimanje) {
		this.zanimanje = zanimanje;
	}
	
	public boolean isZaposlen() {
		return zaposlen;
	}

	public void setZaposlen(boolean zaposlen) {
		this.zaposlen = zaposlen;
	}

	public int primaPlatu() {
		int isplata = 0;
		try {
			if(this.zaposlen == true) {
				isplata = this.getZanimanje().isplata(this);
				System.out.println("" + isplata);
			} else throw new Exception("Nemoguce isplatiti nezaposlenog radnika !");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return isplata;
	}
	
	public void ideNaOdmor(int dani) {
		if(this.naOdmoru = false) {
			this.naOdmoru = true;
			this.brojRadnihDana = brojRadnihDana - dani;
			System.out.println("Radnik ide na odmor.");
		} else System.out.println("Radnik je vec na odmoru.");
	}
	
	public void vracaSeSaOdmora() {
		if(this.naOdmoru = true) {
			this.naOdmoru = false;
			System.out.println("Radnik se vratio sa odmora");
		} else System.out.println("Radnik nije na odmoru.");
	}


	@Override
	public String vratiAdresu() {
		return "Radnik zivi u : " + this.getUlica() + " " + this.getBroj() + ", " + this.getGrad();
	}
	
	
	
	
}
