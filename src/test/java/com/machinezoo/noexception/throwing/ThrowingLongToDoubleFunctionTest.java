// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.io.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.junit.*;

public class ThrowingLongToDoubleFunctionTest {
	void takeThrowing(ThrowingLongToDoubleFunction functional) {
	}
	void takeNonThrowing(LongToDoubleFunction functional) {
	}
	@Test public void lambdas() {
		takeNonThrowing(v -> 2.0);
		takeThrowing(v -> 2.0);
		takeThrowing(v -> {
			if (ThreadLocalRandom.current().nextBoolean())
				throw new IOException();
			else
				return 2.0;
		});
	}
}
