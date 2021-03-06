// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;
import org.junit.*;

public class DefaultLongFunctionTest {
	@Test public void full() {
		@SuppressWarnings("unchecked") OptionalLongFunction<String> full = mock(OptionalLongFunction.class);
		when(full.apply(1L)).thenReturn(Optional.of("value"));
		assertEquals("value", new DefaultLongFunction<String>(full, "default").apply(1L));
		verify(full, only()).apply(1L);
	}
	@Test public void empty() {
		@SuppressWarnings("unchecked") OptionalLongFunction<String> empty = mock(OptionalLongFunction.class);
		when(empty.apply(1L)).thenReturn(Optional.empty());
		assertEquals("default", new DefaultLongFunction<String>(empty, "default").apply(1L));
		verify(empty, only()).apply(1L);
	}
}
