package tests;

import static org.junit.Assert.*;

import org.junit.Before;

import designpatterns.Singleton;

import org.junit.Test;

public class SingletonTest {
	
	private Singleton instance1;
	private Singleton instance2;
	
	@Before
	public void setUp() {
		instance1 = Singleton.getInstance();
		instance2 = Singleton.getInstance();
	}

	@Test
	public void testSingleton() {
		assertEquals(instance1, instance2);
	}

}
