package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import datastuctures.WorkingWithSets;


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
		assertEquals(6, this.workingWithSets.getMySetSize());
	}
	
	@Test
	public void testGetMySetSum() {
		assertEquals(27, this.workingWithSets.getMySetSum());
	}
	
	@Test
	public void testRemoveFromMySet() {
		this.workingWithSets.removeFromMySet(3);
		assertEquals(5, this.workingWithSets.getMySetSize());
		this.workingWithSets.removeFromMySet(11);
		assertEquals(5, this.workingWithSets.getMySetSize());
		this.workingWithSets.removeFromMySet(9);
		assertEquals(4, this.workingWithSets.getMySetSize());
	}
	

}
