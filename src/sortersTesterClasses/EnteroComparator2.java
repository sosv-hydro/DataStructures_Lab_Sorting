package sortersTesterClasses;

import java.util.Comparator;

public class EnteroComparator2 implements Comparator<Entero> {

	@Override
	public int compare(Entero o1, Entero o2) {
		return -o1.compareTo(o2);
	}
}
