package classes.singleton;

import classes.struke.Doktor;

public class DoktorSingleton {
	private Doktor doktor;
	
	public DoktorSingleton() {
		this.doktor = null;
	};
	
	public Doktor getDoktor() {
		if(this.doktor == null) this.doktor = new Doktor();
		return doktor;
	}
}
