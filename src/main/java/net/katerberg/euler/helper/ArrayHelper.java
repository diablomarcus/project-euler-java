package net.katerberg.euler.helper;

import java.util.ArrayList;
import java.util.List;

public class ArrayHelper {

	public List<Integer> combineLists(List<Integer> list0, List<Integer> list1) {
		List<Integer> combinedList = new ArrayList<Integer>();
		for (Integer i : list0) {
			addValueIfNotAlreadyPresent(combinedList, i);
		}
		for (Integer i : list1) {
			addValueIfNotAlreadyPresent(combinedList, i);
		}
		return combinedList;
	}

	public Integer sumList(List<Integer> listToCombine) {

		Integer sum = 0;
		for (Integer i : listToCombine) {
			sum += i;
		}

		return sum;
	}

	private void addValueIfNotAlreadyPresent(List<Integer> combinedList, Integer valueToAdd) {
		if (!combinedList.contains(valueToAdd)) {
			combinedList.add(valueToAdd);
		}
	}
}
