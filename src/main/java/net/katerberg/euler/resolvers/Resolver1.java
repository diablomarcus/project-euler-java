package net.katerberg.euler.resolvers;

import java.util.List;

import net.katerberg.euler.helper.ArrayHelper;
import net.katerberg.euler.helper.MultipleHelper;


//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
//The sum of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.
public class Resolver1 {

	private ArrayHelper arrayHelper;
	private MultipleHelper multipleHelper;

	  
	public Resolver1(ArrayHelper arrayHelper, MultipleHelper multipleHelper) {
		this.arrayHelper = arrayHelper;
		this.multipleHelper = multipleHelper;
	}

	public Integer execute(int maxValueToCheckBelow) {
		List<Integer> threes = multipleHelper.findMultiplesBelow(maxValueToCheckBelow, 3);
		List<Integer> fives = multipleHelper.findMultiplesBelow(maxValueToCheckBelow, 5);
		List<Integer> combined = arrayHelper.combineLists(threes, fives);
		return arrayHelper.sumList(combined);
	}
	
}
