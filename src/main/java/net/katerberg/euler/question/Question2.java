package net.katerberg.euler.question;

import net.katerberg.euler.helper.FibonacciHelper;
import net.katerberg.euler.resolvers.Resolver2;

public class Question2 {

	public static void main(String args[]) {
		Resolver2 resolver = new Resolver2(new FibonacciHelper());
		System.out.println(resolver.findSumOfFibonaccisBelow(4000000));
	}
}
