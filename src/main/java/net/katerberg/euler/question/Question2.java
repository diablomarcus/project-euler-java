package net.katerberg.euler.question;

import net.katerberg.euler.resolvers.Resolver2;

public class Question2 {
	
	public static void main(String args[]) {
		Resolver2 resolver = new Resolver2();
		System.out.println(resolver.findSumOfFibonaccisBelow(4000000));
	}
}
