package classes.singleton;

import classes.struke.Programer;

public class ProgramerSingleton {
	private Programer programer;
	
	public ProgramerSingleton() {
		this.programer = null;
	}
	
	public Programer getProgramer() {
		if(this.programer == null) this.programer = new Programer();
		return this.programer;
	}
}
