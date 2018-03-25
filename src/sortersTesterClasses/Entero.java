package sortersTesterClasses;

public class Entero implements Comparable {
	private int value;

	public Entero(int v) {
		value = v;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return value + "";
	}

	@Override
	public int compareTo(Object o) {
		Entero e = (Entero) o;

		if (this.getValue() > e.getValue())
			return 1;
		if (this.getValue() < e.getValue())
			return -1;
		else
			return 0;
	}

}
