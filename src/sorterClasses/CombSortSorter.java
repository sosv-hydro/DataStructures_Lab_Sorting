package sorterClasses;

public class CombSortSorter<E> extends AbstractSorter<E> {

	public CombSortSorter() {
		super("Comb Sort      ");
	}

	// To find gap between elements
	int getNextGap(int gap) {
		// Shrink gap by Shrink factor
		gap = (gap * 10) / 13;
		if (gap < 1)
			return 1;
		return gap;
	}

	@Override
	protected void auxSort() {
		int n = arr.length;
		// initialize gap
		int gap = n;

		boolean gapSwap = true;

		// Keep running while gap is more than 1 and last iteration is a swap
		while (gap != 1 || gapSwap == true) {
			// Find next gap
			gap = getNextGap(gap);

			// Initialize swapped as false so that we can
			// check if swap happened or not
			gapSwap = false;

			// Compare all elements with current gap
			for (int i = 0; i < n - gap; i++) {
				if (cmp.compare(arr[i], arr[i+gap])==1) {
					E temp = arr[i];
					arr[i] = arr[i + gap];
					arr[i + gap] = temp;

					// Set swapped
					gapSwap = true;
				}
			}
		}
	}
}
