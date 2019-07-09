package classes.struke;

import classes.Radnik;

public class Nezaposlen implements Struka {

	@Override
	public int isplata(Radnik r) throws Exception {
		throw new Exception("Radnik ne moze biti isplacen, nezaposlen je.");
	}

}
