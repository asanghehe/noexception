// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.io.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.junit.*;

public class ThrowingDoubleFunctionTest {
	void takeThrowing(ThrowingDoubleFunction<String> functional) {
	}
	void takeNonThrowing(DoubleFunction<String> functional) {
	}
	@Test public void lambdas() {
		takeNonThrowing(v -> "value");
		takeThrowing(v -> "value");
		takeThrowing(v -> {
			if (ThreadLocalRandom.current().nextBoolean())
				throw new IOException();
			else
				return "value";
		});
	}
}
