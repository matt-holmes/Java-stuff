package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import datastuctures.WorkingWithSets;

import java.util.*;


public class WorkingWithSetsTest {

	private WorkingWithSets workingWithSets;
	
	public WorkingWithSetsTest() {
		this.workingWithSets = new WorkingWithSets();
		this.workingWithSets.addToMySet(1);
		this.workingWithSets.addToMySet(4);
		this.workingWithSets.addToMySet(3);
		this.workingWithSets.addToMySet(8);
		this.workingWithSets.addToMySet(2);
		this.workingWithSets.addToMySet(9);
	}
	
	@Test
	public void testAttemptToAddDuplicate() {
		assertFalse(this.workingWithSets.addToMySet(1));
	}
	
	@Test
	public void testGetMySetSize() {
		assertEquals(this.workingWithSets.getMySetSize(), 6);
	}
	
	@Test
	public void testGetMySetSum() {
		assertEquals(27, this.workingWithSets.getMySetSum());
	}
	
	@Test
	public void testRemoveFromMySet() {
		this.workingWithSets.removeFromMySet(3);
		assertEquals(this.workingWithSets.getMySetSize(), 5);
		this.workingWithSets.removeFromMySet(11);
		assertEquals(this.workingWithSets.getMySetSize(), 5);
		this.workingWithSets.removeFromMySet(9);
		assertEquals(this.workingWithSets.getMySetSize(), 4);
	}
	

}
