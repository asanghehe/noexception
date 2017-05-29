// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;

public class DefaultDoublePredicateTest {
	@Test public void full() {
		OptionalDoublePredicate full = mock(OptionalDoublePredicate.class);
		when(full.test(1.0)).thenReturn(OptionalBoolean.of(true));
		assertEquals(true, new DefaultDoublePredicate(full, false).test(1.0));
		verify(full, only()).test(1.0);
	}
	@Test public void empty() {
		OptionalDoublePredicate empty = mock(OptionalDoublePredicate.class);
		when(empty.test(1.0)).thenReturn(OptionalBoolean.empty());
		assertEquals(false, new DefaultDoublePredicate(empty, false).test(1.0));
		verify(empty, only()).test(1.0);
	}
}
