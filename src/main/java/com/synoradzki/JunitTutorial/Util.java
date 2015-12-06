package com.synoradzki.JunitTutorial;

public class Util {

	public static <T> T retrieveFirstElement(Iterable<T> list) {
		T result = null;

		for (T iter : list) {
			result = iter;
			break;
		}
		return result;
	}

}
