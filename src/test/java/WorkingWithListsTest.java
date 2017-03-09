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
		assertEquals(" item 1 item 2 item 3 item 4 item 5",
				this.workingWithLists.getResultStandardForLoop());
	}
	
	@Test
	public void testGetResultNewForLoop() {
		assertEquals(" item 1 item 2 item 3 item 4 item 5",
				this.workingWithLists.getResultStandardForLoop());
	}

	@Test
	public void testGetResultWithIterator() {
		assertEquals(" item 1 item 2 item 3 item 4 item 5",
				this.workingWithLists.getResultWithIterator());
	}
	
	@Test
	public void testGetMyListSubList() {
		List<String> sublist = this.workingWithLists.getMyListSubList(2, 4);
		assertEquals("item 3", sublist.get(0));
		assertEquals("item 4", sublist.get(1));
	}
	
	@Test
	public void testGetMyListSize() {
		assertEquals(5, this.workingWithLists.getMyListSize());
	}
	
	@Test
	public void testRemoveFromMyListByObject() {
		this.workingWithLists.removeFromMyListByObject("item 2");
		assertEquals(4, this.workingWithLists.getMyListSize());
	}
	
	@Test
	public void testRemoveFromMyListByIndex() {
		this.workingWithLists.removeFromMyListByIndex(3);
		assertEquals(4, this.workingWithLists.getMyListSize());
	}

}
