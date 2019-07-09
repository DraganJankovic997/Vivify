package classes.struke;

import classes.Radnik;

public class IsplataStrategy {
	private Struka str;
	//nisam stigao da iskoristim
	public IsplataStrategy() {
		
	}
	
	public void setStruka(Struka s) {
		this.str = s;
	}
	
	public void isplati(Radnik r) {
		str.isplata(r);
	}
}
