package net.katerberg.euler.question;

import net.katerberg.euler.helper.ArrayHelper;
import net.katerberg.euler.helper.MultipleHelper;
import net.katerberg.euler.resolvers.Resolver1;

public class Question1 {
	public static void main(String args[]) {
		Resolver1 resolver = new Resolver1(new ArrayHelper(), new MultipleHelper());
		System.out.println(resolver.execute(1000));
	}
}
