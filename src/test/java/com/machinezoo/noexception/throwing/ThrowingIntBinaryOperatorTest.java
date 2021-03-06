// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.io.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.junit.*;

public class ThrowingIntBinaryOperatorTest {
	void takeThrowing(ThrowingIntBinaryOperator functional) {
	}
	void takeNonThrowing(IntBinaryOperator functional) {
	}
	@Test public void lambdas() {
		takeNonThrowing((l, r) -> 2);
		takeThrowing((l, r) -> 2);
		takeThrowing((l, r) -> {
			if (ThreadLocalRandom.current().nextBoolean())
				throw new IOException();
			else
				return 2;
		});
	}
}
