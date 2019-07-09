package classes.singleton;

import classes.struke.Nezaposlen;

public class NezaposlenSingleton {
	private Nezaposlen nezaposlen;
	
	public NezaposlenSingleton() {
		this.nezaposlen = null;
	}
	
	public Nezaposlen getNezaposlen() {
		if(this.nezaposlen == null) this.nezaposlen = new Nezaposlen();
		return this.nezaposlen;
	}
}
