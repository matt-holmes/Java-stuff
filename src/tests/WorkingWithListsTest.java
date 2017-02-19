package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
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

	@Test
	public void testGetResultWithIterator() {
		assertEquals(this.workingWithLists.getResultWithIterator(), 
				" item 1 item 2 item 3 item 4 item 5");
	}
	
	@Test
	public void testGetMyListSubList() {
		List<String> sublist = this.workingWithLists.getMyListSubList(2, 4);
		assertEquals(sublist.get(0), "item 3");
		assertEquals(sublist.get(1), "item 4");
	}
	
	@Test
	public void testGetMyListSize() {
		assertEquals(this.workingWithLists.getMyListSize(), 
				5);
	}
	
	@Test
	public void testRemoveFromMyListByObject() {
		this.workingWithLists.removeFromMyListByObject("item 2");
		assertEquals(this.workingWithLists.getMyListSize(), 
				4);
	}
	
	@Test
	public void testRemoveFromMyListByIndex() {
		this.workingWithLists.removeFromMyListByIndex(3);
		assertEquals(this.workingWithLists.getMyListSize(), 
				4);
	}

}
