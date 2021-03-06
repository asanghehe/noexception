// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class OptionalToLongBiFunctionTest {
	@Test public void conversions() {
		assertEquals(OptionalLong.of(2L), create((t, u) -> OptionalLong.of(2L)).apply("input1", "input2"));
		assertEquals(2L, create((t, u) -> OptionalLong.of(2L)).orElse(3L).applyAsLong("input1", "input2"));
		assertEquals(2L, create((t, u) -> OptionalLong.of(2L)).orElseGet(() -> 2L).applyAsLong("input1", "input2"));
		assertEquals(OptionalLong.empty(), create((t, u) -> OptionalLong.empty()).apply("input1", "input2"));
		assertEquals(3L, create((t, u) -> OptionalLong.empty()).orElse(3L).applyAsLong("input1", "input2"));
		assertEquals(3L, create((t, u) -> OptionalLong.empty()).orElseGet(() -> 3L).applyAsLong("input1", "input2"));
	}
	private OptionalToLongBiFunction<String, String> create(OptionalToLongBiFunction<String, String> lambda) {
		return lambda;
	}
}
