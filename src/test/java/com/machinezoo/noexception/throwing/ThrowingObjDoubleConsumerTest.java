// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.io.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.junit.*;

public class ThrowingObjDoubleConsumerTest {
	void takeThrowing(ThrowingObjDoubleConsumer<String> functional) {
	}
	void takeNonThrowing(ObjDoubleConsumer<String> functional) {
	}
	@Test public void lambdas() {
		takeNonThrowing((x, y) -> {});
		takeThrowing((x, y) -> {});
		takeThrowing((x, y) -> {
			if (ThreadLocalRandom.current().nextBoolean())
				throw new IOException();
			else
				return ;
		});
	}
}