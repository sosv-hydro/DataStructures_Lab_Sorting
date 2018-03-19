package sortersTesterClasses;

public class Entero implements Comparable<Integer> {
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
	public int compareTo(Integer o) {
		if (this.getValue() == o)
			return 0;
		else if (this.getValue() > o)
			return 1;
		else
			return -1;
	}

}
