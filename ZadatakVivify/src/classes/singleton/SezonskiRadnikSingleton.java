package classes.singleton;

import classes.struke.SezonskiRadnik;

public class SezonskiRadnikSingleton {
	private SezonskiRadnik sr;
	
	public SezonskiRadnikSingleton() {
		this.sr = null;
	}
	
	public SezonskiRadnik getSezonskiRadnik() {
		if(this.sr == null) this.sr = new SezonskiRadnik();
		return this.sr;
	}
}
