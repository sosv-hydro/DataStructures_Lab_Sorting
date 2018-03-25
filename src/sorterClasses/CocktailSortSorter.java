package sorterClasses;

public class CocktailSortSorter<E> extends AbstractSorter<E> {

	public CocktailSortSorter() {
		super("Cocktail Sort  ");
	}

	@Override
	protected void auxSort() {
		boolean swapped = true;
		int start = 0;
		int end = arr.length;

		while (swapped == true) {
			swapped = false;

			//same as bubble sort 
			for (int i = start; i < end - 1; ++i) {
				if (cmp.compare(arr[i], arr[i+1])==1) {
					E temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
			
			swapped = false;

			end = end - 1;

			//same as bubble sort but backwards
			for (int i = end - 1; i >= start; i--) {
				if (cmp.compare(arr[i], arr[i+1])==1) {
					E temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}

			start = start + 1;
		}
	}
}
