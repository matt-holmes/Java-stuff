package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import datastuctures.WorkingWithLists;

public class WorkingWithListsTest {
	
	private WorkingWithLists workingWithLists;
	
	public WorkingWithListsTest() {
		this.workingWithLists = new WorkingWithLists();
		this.workingWithLists.addToList("item 1");
		this.workingWithLists.addToList("item 2");
		this.workingWithLists.addToList("item 3");
		this.workingWithLists.addToList("item 4");
		this.workingWithLists.addToList("item 5");
	}
	

	@Test
	public void testGetResultStandardForLoop() {
		assertEquals(this.workingWithLists.getResultStandardForLoop(), 
				" item 1 item 2 item 3 item 4 item 5");
	}
	
	@Test
	public void testGetResultNewForLoop() {
		assertEquals(this.workingWithLists.getResultStandardForLoop(), 
				" item 1 item 2 item 3 item 4 item 5");
	}

}
