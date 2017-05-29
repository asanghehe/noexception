// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class OptionalLongToDoubleFunctionTest {
	@Test public void conversions() {
		assertEquals(OptionalDouble.of(2.0), create(v -> OptionalDouble.of(2.0)).apply(1L));
		assertEquals(2.0, create(v -> OptionalDouble.of(2.0)).orElse(3.0).applyAsDouble(1L), 0.1);
		assertEquals(2.0, create(v -> OptionalDouble.of(2.0)).orElseGet(() -> 2.0).applyAsDouble(1L), 0.1);
		assertEquals(OptionalDouble.empty(), create(v -> OptionalDouble.empty()).apply(1L));
		assertEquals(3.0, create(v -> OptionalDouble.empty()).orElse(3.0).applyAsDouble(1L), 0.1);
		assertEquals(3.0, create(v -> OptionalDouble.empty()).orElseGet(() -> 3.0).applyAsDouble(1L), 0.1);
	}
	private OptionalLongToDoubleFunction create(OptionalLongToDoubleFunction lambda) {
		return lambda;
	}
}
