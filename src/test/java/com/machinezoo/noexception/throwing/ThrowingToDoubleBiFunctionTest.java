// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.io.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.junit.*;

public class ThrowingToDoubleBiFunctionTest {
	void takeThrowing(ThrowingToDoubleBiFunction<String, String> functional) {
	}
	void takeNonThrowing(ToDoubleBiFunction<String, String> functional) {
	}
	@Test public void lambdas() {
		takeNonThrowing((t, u) -> 2.0);
		takeThrowing((t, u) -> 2.0);
		takeThrowing((t, u) -> {
			if (ThreadLocalRandom.current().nextBoolean())
				throw new IOException();
			else
				return 2.0;
		});
	}
}
